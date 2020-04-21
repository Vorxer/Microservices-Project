import { Component, OnInit } from '@angular/core';
import {LongVesselRecord} from '../models/LongVesselRecord';
import {LongVesselRecordService} from '../services/LongVesselRecord.service';
import {ActivatedRoute} from '@angular/router';
import {OperationRecord} from '../models/OperationRecord';
import {OperationRecordService} from '../services/OperationRecord.service';

@Component({
  selector: 'app-operation-update',
  templateUrl: './operation-update.component.html',
  styleUrls: ['./operation-update.component.css']
})
export class OperationUpdateComponent implements OnInit {

  duration: string;
  status: string;
  location: string;
  log: string;

  OID;
  operationRecord: OperationRecord;

  constructor(private operationRecordService: OperationRecordService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.OID = this.route.snapshot.paramMap.get('oid');
    this.operationRecordService.getOperation(this.OID).subscribe(operationRecord => {
      this.operationRecord = operationRecord;
    });
  }

  update() {
    this.operationRecordService.updateOperation(this.OID, this.duration, this.status, this.location, this.log);
  }

}
