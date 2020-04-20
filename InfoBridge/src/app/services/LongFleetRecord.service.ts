import { Injectable } from '@angular/core';
import {Observable, throwError} from 'rxjs';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';

import {LongFleetRecord} from '../models/LongFleetRecord';
import {FleetUpdateBody} from '../models/FleetUpdateBody';


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
  getAllUrl = 'http://localhost:8200/bridge/getFleets/';
  updateUrl = 'http://localhost:8200/bridge/updateFleet/';

  constructor(private http: HttpClient) { }


  // Get Vessels
  public getFleet(FID: number): Observable<LongFleetRecord> {
    return this.http.get<LongFleetRecord>(this.getUrl + FID);
  }

  public getFleets(): Observable<LongFleetRecord[]> {
    return this.http.get<LongFleetRecord[]>(this.getAllUrl);
  }

  public updateFleet(FID: number , operationalRange: number, endurance: number, GPSLocation: string):
    void {
    const updateBody: FleetUpdateBody = new FleetUpdateBody(operationalRange, endurance, GPSLocation);
    this.http.post<any>(this.updateUrl + FID, updateBody).subscribe();
  }

}
