import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Service} from '../../../Model/service.model';
import {ServiceService} from '../../../Service/service.service';

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public services: Service[];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(public serviceService: ServiceService) {
  }

  ngOnInit() {
    this.subscription = this.serviceService.getAllServices().subscribe((data: Service[]) => {
      this.services = data;
      this.totalRec = this.services.length;
    });
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteService(id: number) {
    this.subscription = this.serviceService.deleteService(id).subscribe((data: Service) => {
      this.updateDataAfterDelete(id);
    });
  }
  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.services.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.services[i].id == id) {
        this.services.splice(i, 1);
        break;
      }
    }
  }
}
