import {Component, OnDestroy, OnInit} from '@angular/core';
import {Service} from '../../../Model/service.model';
import {Subscription} from 'rxjs';
import {ServiceService} from '../../../Service/service.service';
import {ActivatedRoute, Params, Router} from '@angular/router';

@Component({
  selector: 'app-edit-service',
  templateUrl: './edit-service.component.html',
  styleUrls: ['./edit-service.component.css']
})
export class EditServiceComponent implements OnInit,OnDestroy {
  public service: Service;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public serviceService: ServiceService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.service = new Service();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      const id = data.id;
      this.subscription = this.serviceService.getService(id).subscribe((service: Service) => {
        this.service = service;
      });
    });
  }

  onEditService() {
    // @ts-ignore
    this.subscription = this.serviceService.updateService( this.service).subscribe((data: Service) => {
      this.routerService.navigate(['services']);
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }
  }

}
