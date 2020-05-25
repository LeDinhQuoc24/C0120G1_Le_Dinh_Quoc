import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../Model/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API = 'http://localhost:3000/employees';

  constructor(public http: HttpClient) {
  }

  getAllEmployees(): Observable<any> {
    return this.http.get(this.API);
  }

  getEmployee(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }

  addEmployee(employee: Employee): Observable<any> {
    return this.http.post(this.API, employee);
  }

  updateEmployee(employee, id): Observable<any> {
    return this.http.put(`${this.API}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }
}
