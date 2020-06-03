

import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {CrudOperations} from './CrudOperation';

export abstract class CrudService<T, ID> implements CrudOperations<T, ID> {


  protected constructor(
    // tslint:disable-next-line:variable-name
    protected _http: HttpClient,
    // tslint:disable-next-line:variable-name
    protected _base: string
  ) {
  }

  save(t: T): Observable<T> {
    return this._http.post<T>(this._base, t);
  }
  update( t: T, id: ID): Observable<T> {
    return this._http.put<T>(`${this._base}/${id}`, t);
  }
  findOne(id: ID): Observable<T> {
    return this._http.get<T>(`${this._base}/${id}`);
  }

  findAll(): Observable<T[]> {
    return this._http.get<T[]>(this._base);
  }

  delete(id: ID): Observable<any> {
    return this._http.delete<T>(`${this._base}/${id}`);
  }
}
