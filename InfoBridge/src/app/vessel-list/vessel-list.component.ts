import {Component, Input, OnInit} from '@angular/core';
import {LongVesselRecord} from '../models/LongVesselRecord';

@Component({
  selector: 'app-vessel-list',
  templateUrl: './vessel-list.component.html',
  styleUrls: ['./vessel-list.component.css']
})
export class VesselListComponent implements OnInit {

  @Input()vessels: number[] = [1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11 , 12, 13 , 14 , 15, 16, 17, 18, 19 , 20];

  constructor() { }

   // vessels: Array<number> = [1, 2, 4];

  ngOnInit(): void {
  }

}
