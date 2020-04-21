import { Component, OnInit } from '@angular/core';
import {LongFleetRecordService} from '../services/LongFleetRecord.service';
import {ActivatedRoute} from '@angular/router';
import {LongFleetRecord} from '../models/LongFleetRecord';
import {ShortVesselRecord} from '../models/ShortVesselRecord';
import {OperationRecordService} from '../services/OperationRecord.service';
import {OperationRecord} from '../models/OperationRecord';
import {ShortFleetRecord} from '../models/ShortFleetRecord';

@Component({
  selector: 'app-long-operation-record',
  templateUrl: './long-operation-record.component.html',
  styleUrls: ['./long-operation-record.component.css']
})
export class LongOperationRecordComponent implements OnInit {

  OID;

  // constructor(private longFleetRecordService: LongFleetRecordService,
  //             private getLongVesselRecordService: LongVesselRecordService,
  //             private route: ActivatedRoute) {}

  constructor(private operationRecordService: OperationRecordService,
              private route: ActivatedRoute) {}

  operationRecord: OperationRecord;
  // flagshipRecord: LongVesselRecord;
  ngOnInit() {
    console.log('here');
    this.OID = this.route.snapshot.paramMap.get('oid');
    this.operationRecordService.getOperation(this.OID).subscribe(operationRecord => {
      this.operationRecord = operationRecord;
    });
    // this.getLongVesselRecordService.getVessel(this.longFleetRecord.flagshipID).subscribe(longVesselRecord => {
    //   this.flagshipRecord = longVesselRecord;
    // });
  }

  public getFleetList(): number[] {
    const fleetList: number[] = [];
    for (const vessel of this.operationRecord.fleetRecords) {
      const cvessel: ShortFleetRecord = vessel;
      fleetList.push(cvessel.fleetID);
    }
    return fleetList;
  }

}
