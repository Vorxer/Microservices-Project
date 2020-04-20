import { Component, OnInit } from '@angular/core';
import {LongVesselRecord} from '../models/LongVesselRecord';
import {LongVesselRecordService} from '../services/LongVesselRecord.service';
import {ActivatedRoute} from '@angular/router';
import {LongFleetRecord} from '../models/LongFleetRecord';
import {LongFleetRecordService} from '../services/LongFleetRecord.service';

@Component({
  selector: 'app-fleet-update',
  templateUrl: './fleet-update.component.html',
  styleUrls: ['./fleet-update.component.css']
})
export class FleetUpdateComponent implements OnInit {
  operationalRange: number;
  endurance: number;
  GPSLocation: string;

  FID;
  longFleetRecord: LongFleetRecord;

  constructor(private longFleetRecordService: LongFleetRecordService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.FID = this.route.snapshot.paramMap.get('vid');
    this.longFleetRecordService.getFleet(this.FID).subscribe(longFleetRecord => {
      this.longFleetRecord = longFleetRecord;
    });
  }

  update() {
    this.longFleetRecordService.updateFleet(this.FID, this.operationalRange, this.endurance, this.GPSLocation);
  }

}
