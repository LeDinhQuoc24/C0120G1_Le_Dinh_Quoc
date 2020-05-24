import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Router} from '@angular/router';
import {Service} from '../../../Model/service.model';
import {ServiceService} from '../../../Service/service.service';

@Component({
  selector: 'app-add-service',
  templateUrl: './add-service.component.html',
  styleUrls: ['./add-service.component.css']
})
export class AddServiceComponent implements OnInit, OnDestroy {
  public service: Service;
  public subscription: Subscription;

  constructor(
    public serviceService: ServiceService,
    public routerService: Router
  ) {}
  ngOnInit() {
    this.service = new Service();
  }

  onAddService() {
    this.subscription = this.serviceService.addService(this.service).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['services']);
      }
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
