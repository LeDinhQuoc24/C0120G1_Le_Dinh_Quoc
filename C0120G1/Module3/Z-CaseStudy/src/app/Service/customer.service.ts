import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../Model/customer.model';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API = 'http://localhost:3000/customers';

  constructor(public http: HttpClient) {
  }

  getAllCustomers(): Observable<any> {
    return this.http.get(this.API);
  }

  getCustomer(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }

  addCustomer(customer: Customer): Observable<any> {
    return this.http.post(this.API, customer);
  }

  updateCustomer(customer, id): Observable<any> {
    return this.http.put(`${this.API}/${id}`, customer);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }
}
