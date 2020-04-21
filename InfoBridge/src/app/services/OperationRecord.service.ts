import { Injectable } from '@angular/core';
import {Observable, throwError} from 'rxjs';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';


import {OperationRecord} from '../models/OperationRecord';
import {OperationUpdateBody} from '../models/OperationUpdateBody';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class OperationRecordService {

  getUrl = 'http://localhost:8200/bridge/getOperation/';
  getAllUrl = 'http://localhost:8200/bridge/getOperations/';
  updateUrl = 'http://localhost:8200/bridge/updateOperation/';

  constructor(private http: HttpClient) { }

  public getOperation(OID: number): Observable<OperationRecord> {
    return this.http.get<OperationRecord>(this.getUrl + OID);
  }

  public getOperations(): Observable<OperationRecord[]> {
    return this.http.get<OperationRecord[]>(this.getAllUrl);
  }

  public updateOperation(OID: number, duration: string, status: string, location: string, log: string):
    void {
    const updateBody: OperationUpdateBody = new OperationUpdateBody(duration, status, location, log);
    this.http.post<any>(this.updateUrl + OID, updateBody).subscribe();
  }

}
