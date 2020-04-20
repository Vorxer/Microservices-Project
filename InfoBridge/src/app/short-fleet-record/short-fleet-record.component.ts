import {Component, Input, OnInit} from '@angular/core';
import {LongFleetRecordService} from '../services/LongFleetRecord.service';
import {LongFleetRecord} from '../models/LongFleetRecord';

@Component({
  selector: 'app-short-fleet-record',
  templateUrl: './short-fleet-record.component.html',
  styleUrls: ['./short-fleet-record.component.css']
})
export class ShortFleetRecordComponent implements OnInit {

  @Input()FID: number;

  constructor(private longFleetRecordService: LongFleetRecordService) { }

  record: LongFleetRecord;

  ngOnInit() {
    this.longFleetRecordService.getFleet(this.FID).subscribe(longFleetRecord => {
      this.record = longFleetRecord;
    });
  }
}
