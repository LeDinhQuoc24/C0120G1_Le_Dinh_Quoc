import {Component, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {
  registerFormService: FormGroup;

  constructor() {
  }

  ngOnInit() {
  }

  onSubmit() {
  }

}
