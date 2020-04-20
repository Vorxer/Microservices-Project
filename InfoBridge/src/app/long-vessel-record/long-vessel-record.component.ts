import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { LongVesselRecordService } from '../services/LongVesselRecord.service';
import { LongVesselRecord} from '../models/LongVesselRecord';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';



@Component({
  selector: 'app-long-vessel-record',
  templateUrl: './long-vessel-record.component.html',
  styleUrls: ['./long-vessel-record.component.css']
})
export class LongVesselRecordComponent implements OnInit {

  VID;

  constructor(private getLongVesselRecordService: LongVesselRecordService, private route: ActivatedRoute) {}

  longVesselRecord: LongVesselRecord;

  ngOnInit() {
    this.VID = this.route.snapshot.paramMap.get('vid');
    this.getLongVesselRecordService.getVessel(this.VID).subscribe(longVesselRecord => {
      this.longVesselRecord = longVesselRecord;
    });
  }

  update() {
  }
}
