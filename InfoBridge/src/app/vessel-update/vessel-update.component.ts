import { Component, OnInit } from '@angular/core';
import {LongVesselRecordService} from '../services/LongVesselRecord.service';
import {ActivatedRoute} from '@angular/router';
import {LongVesselRecord} from '../models/LongVesselRecord';

@Component({
  selector: 'app-vessel-update',
  templateUrl: './vessel-update.component.html',
  styleUrls: ['./vessel-update.component.css']
})
export class VesselUpdateComponent implements OnInit {
  availableRange: number;
  endurance: number;
  combatReadinessRating: number;

  VID;
  longVesselRecord: LongVesselRecord;

  constructor(private getLongVesselRecordService: LongVesselRecordService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.VID = this.route.snapshot.paramMap.get('vid');
    this.getLongVesselRecordService.getVessel(this.VID).subscribe(longVesselRecord => {
      this.longVesselRecord = longVesselRecord;
    });
  }

  update() {
    this.getLongVesselRecordService.updateVessel(this.VID, this.availableRange, this.endurance, this.combatReadinessRating);
  }
}
