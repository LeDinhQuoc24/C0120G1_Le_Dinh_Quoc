import {Component, OnDestroy, OnInit} from '@angular/core';
import {Service} from '../../../Model/service.model';
import {Subscription} from 'rxjs';
import {ServiceService} from '../../../Service/service.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-edit-service',
  templateUrl: './edit-service.component.html',
  styleUrls: ['./edit-service.component.css']
})
export class EditServiceComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  addServiceForm: FormGroup;
  public id: number;

  constructor(
    public serviceService: ServiceService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    private fb: FormBuilder
  ) {
  }

  ngOnInit() {
    this.addServiceForm = this.fb.group({
      name: ['', [Validators.required]],
      areaUsed: ['', [Validators.required, Validators.min(1)]],
      amount: ['', [Validators.required, Validators.min(1)]],
      maximumPeople: ['', [Validators.required, Validators.min(1)]],
      typeRent: ['', [Validators.required]],
      typeService: ['', [Validators.required]],
    });
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.id = data.id;
      this.subscription = this.serviceService.getService(this.id).subscribe((service: Service) => {
        this.addServiceForm.patchValue(service);
      });
    });
  }

  onEditService() {
    this.subscription = this.serviceService.updateService(this.addServiceForm.value,this.id).subscribe((data: Service) => {
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
