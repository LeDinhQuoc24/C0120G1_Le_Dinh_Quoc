import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Contract} from '../Model/contract.model';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  public API = 'http://localhost:3000/contracts';

  constructor(public http: HttpClient) {
  }

  getAllContracts(): Observable<any> {
    return this.http.get(this.API);
  }

  getContract(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }

  addContract(contract: Contract): Observable<any> {
    return this.http.post(this.API, contract);
  }

  updateContract(contract, id): Observable<any> {
    return this.http.put(`${this.API}/${id}`, contract);
  }

  deleteContract(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }
}
