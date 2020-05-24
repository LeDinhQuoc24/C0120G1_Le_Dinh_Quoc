import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Service} from '../Model/service.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public API = 'http://localhost:3000/services';

  constructor(public http: HttpClient) {
  }

  getAllServices(): Observable<Service[]> {
    // @ts-ignore
    return this.http.get(this.API);
  }

  getService(id: number): Observable<Service> {
    // @ts-ignore
    return this.http.get(`${this.API}/${id}`);
  }

  addService(service: Service): Observable<Service> {
    // @ts-ignore
    return this.http.post(this.API, service);
  }

  updateService(service: Service): Observable<Service> {
    // @ts-ignore
    return this.http.put(`${this.API}/${service.id}`, service);
  }

  deleteService(id: number): Observable<Service> {
    // @ts-ignore
    return this.http.delete(`${this.API}/${id}`);
  }
}
