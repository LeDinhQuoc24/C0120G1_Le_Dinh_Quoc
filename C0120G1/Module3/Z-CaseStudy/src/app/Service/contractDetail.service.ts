import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ContractDetail} from '../Model/contractDetail.model';

@Injectable({
  providedIn: 'root'
})
export class ContractDetailDetailService {
  public API = 'http://localhost:3000/contractDetails';

  constructor(public http: HttpClient) {
  }

  getAllContractDetails(): Observable<any> {
    return this.http.get(this.API);
  }

  getContractDetail(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }

  addContractDetail(contractDetail: ContractDetail): Observable<any> {
    return this.http.post(this.API, contractDetail);
  }

  updateContractDetail(contractDetail, id): Observable<any> {
    return this.http.put(`${this.API}/${id}`, contractDetail);
  }

  deleteContractDetail(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }
}
