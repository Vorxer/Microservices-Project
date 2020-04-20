import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {LongFleetRecordService} from '../services/LongFleetRecord.service';
import {LongFleetRecord} from '../models/LongFleetRecord';
import {LongVesselRecord} from '../models/LongVesselRecord';
import {LongVesselRecordService} from '../services/LongVesselRecord.service';
import {ShortVesselRecord} from '../models/ShortVesselRecord';
import {VesselUpdateBody} from '../models/VesselUpdateBody';

@Component({
  selector: 'app-long-fleet-record',
  templateUrl: './long-fleet-record.component.html',
  styleUrls: ['./long-fleet-record.component.css']
})
export class LongFleetRecordComponent implements OnInit {

  FID;

  // constructor(private longFleetRecordService: LongFleetRecordService,
  //             private getLongVesselRecordService: LongVesselRecordService,
  //             private route: ActivatedRoute) {}

  constructor(private longFleetRecordService: LongFleetRecordService,
              private route: ActivatedRoute) {}

  longFleetRecord: LongFleetRecord;
  // flagshipRecord: LongVesselRecord;
  ngOnInit() {
    console.log('here');
    this.FID = this.route.snapshot.paramMap.get('fid');
    this.longFleetRecordService.getFleet(this.FID).subscribe(longFleetRecord => {
      this.longFleetRecord = longFleetRecord;
    });
    // this.getLongVesselRecordService.getVessel(this.longFleetRecord.flagshipID).subscribe(longVesselRecord => {
    //   this.flagshipRecord = longVesselRecord;
    // });
  }

  public getVesselList(): number[] {
    const vesselList: number[] = [];
    for (const vessel of this.longFleetRecord.vesselRecords) {
      const cvessel: ShortVesselRecord = vessel;
      vesselList.push(cvessel.vesselID);
    }
    return vesselList;
  }
}
