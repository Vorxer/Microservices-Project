import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { LongVesselRecordService } from '../services/LongVesselRecord.service';
import { LongVesselRecord} from '../models/LongVesselRecord';

@Component({
  selector: 'app-long-vessel-record',
  templateUrl: './long-vessel-record.component.html',
  styleUrls: ['./long-vessel-record.component.css']
})
export class LongVesselRecordComponent implements OnInit {

  @Input()VID: number;

  constructor(private getLongVesselRecordService: LongVesselRecordService) { }

  longVesselRecord: LongVesselRecord;

  ngOnInit() {
    this.getLongVesselRecordService.getVessel(this.VID).subscribe(longVesselRecord => {
      this.longVesselRecord = longVesselRecord;
    });
  }

}
