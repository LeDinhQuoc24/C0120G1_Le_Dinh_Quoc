import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Router} from '@angular/router';
import {ServiceService} from '../../../Service/service.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add-service',
  templateUrl: './add-service.component.html',
  styleUrls: ['./add-service.component.css']
})
export class AddServiceComponent implements OnInit, OnDestroy {
  addServiceForm: FormGroup;
  public subscription: Subscription;
  message = '';

  constructor(
    public serviceService: ServiceService,
    public routerService: Router,
    private fb: FormBuilder
  ) {}
  ngOnInit() {
    this.addServiceForm = this.fb.group({
      name: ['', [Validators.required]],
      codeService: ['', [Validators.required, Validators.pattern(/^DV-\d{4}$/)]],
      areaUsed: ['', [Validators.required, Validators.min(1)]],
      amount: ['', [Validators.required, Validators.min(1)]],
      maximumPeople: ['', [Validators.required, Validators.min(1)]],
      typeRent: ['', [Validators.required]],
      typeService: ['', [Validators.required]],
    });
  }

  onAddService() {
    this.subscription = this.serviceService.addService(this.addServiceForm.value).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['services']);
      }
    });
    this.message = 'Thêm mới thành công thông tin dịch vụ';
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

}
