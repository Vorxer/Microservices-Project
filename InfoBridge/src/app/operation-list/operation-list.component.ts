import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-operation-list',
  templateUrl: './operation-list.component.html',
  styleUrls: ['./operation-list.component.css']
})
export class OperationListComponent implements OnInit {

  @Input()operations: number[] = [1, 2];

  constructor() { }

  ngOnInit(): void {
  }

}
