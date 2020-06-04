import { Injectable } from '@angular/core';
import {CrudService} from './CrudService';
import {BuildingModel} from '../Model/building.model';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BuildingService extends CrudService<BuildingModel, number> {
  constructor(protected  http: HttpClient) {
    super(http, 'http://localhost:3000/buildings');
  }
}