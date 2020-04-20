import { Injectable } from '@angular/core';
import {Observable, throwError} from 'rxjs';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';

import {VesselUpdateBody} from '../models/VesselUpdateBody';
import {LongFleetRecord} from '../models/LongFleetRecord';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LongFleetRecordService {
  getUrl = 'http://localhost:8200/bridge/getFleet/';
  updateUrl = 'http://localhost:8200/bridge/updateFleet/';

  constructor(private http: HttpClient) { }


  // Get Vessels
  public getFleet(FID: number): Observable<LongFleetRecord> {
    return this.http.get<LongFleetRecord>(this.getUrl + FID);
  }

  public updateFleet(VID: number, availableRange: number,  endurance: number, combatReadinessRating: number):
    void {
    const updateBody: VesselUpdateBody = new VesselUpdateBody(availableRange, endurance, combatReadinessRating);
    this.http.post<any>(this.updateUrl + VID, updateBody).subscribe();
  }

}
