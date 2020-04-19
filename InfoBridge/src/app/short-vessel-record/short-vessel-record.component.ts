import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { LongVesselRecordService } from '../services/LongVesselRecord.service';
import { LongVesselRecord} from '../models/LongVesselRecord';
import { AppRoutingModule} from '../app-routing.module';

@Component({
  selector: 'app-short-vessel-record',
  templateUrl: './short-vessel-record.component.html',
  styleUrls: ['./short-vessel-record.component.css']
})
export class ShortVesselRecordComponent implements OnInit {

  @Input()VID: number;

  constructor(private getLongVesselRecordService: LongVesselRecordService) { }

  record: LongVesselRecord;

  ngOnInit() {
    this.getLongVesselRecordService.getVessel(this.VID).subscribe(longVesselRecord => {
      this.record = longVesselRecord;
    });
  }
}
