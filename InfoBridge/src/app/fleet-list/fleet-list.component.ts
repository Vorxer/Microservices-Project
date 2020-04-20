import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-fleet-list',
  templateUrl: './fleet-list.component.html',
  styleUrls: ['./fleet-list.component.css']
})
export class FleetListComponent implements OnInit {

  @Input()fleets: number[] = [1, 2, 3];

  constructor() { }

  ngOnInit(): void {
  }

}
