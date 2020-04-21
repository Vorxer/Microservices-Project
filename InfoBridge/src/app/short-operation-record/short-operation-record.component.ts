import {Component, Input, OnInit} from '@angular/core';
import {LongFleetRecordService} from '../services/LongFleetRecord.service';
import {LongFleetRecord} from '../models/LongFleetRecord';
import {OperationRecordService} from '../services/OperationRecord.service';
import {OperationRecord} from '../models/OperationRecord';

@Component({
  selector: 'app-short-operation-record',
  templateUrl: './short-operation-record.component.html',
  styleUrls: ['./short-operation-record.component.css']
})
export class ShortOperationRecordComponent implements OnInit {

  @Input()OID: number;

  constructor(private operationRecordService: OperationRecordService) { }

  record: OperationRecord;

  ngOnInit() {
    this.operationRecordService.getOperation(this.OID).subscribe(record => {
      this.record = record;
    });
  }

}
