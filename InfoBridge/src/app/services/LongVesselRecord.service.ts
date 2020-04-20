import { Injectable } from '@angular/core';
import {Observable, throwError} from 'rxjs';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';

import { LongVesselRecord } from '../models/LongVesselRecord';
import {VesselUpdateBody} from '../models/VesselUpdateBody';
import { catchError, retry } from 'rxjs/operators';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LongVesselRecordService {
  getUrl = 'http://localhost:8200/bridge/getVessel/';
  updateUrl = 'http://localhost:8200/bridge/updateVessel/';

  constructor(private http: HttpClient) { }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  }

  // Get Vessels
   public getVessel(VID: number): Observable<LongVesselRecord> {
     return this.http.get<LongVesselRecord>(this.getUrl + VID);
   }

  public updateVessel(VID: number, availableRange: number,  endurance: number, combatReadinessRating: number):
    void {
    const updateBody: VesselUpdateBody = new VesselUpdateBody(availableRange, endurance, combatReadinessRating);
    this.http.post<any>(this.updateUrl + VID, updateBody).subscribe();
  }

  // // Get Todos
  // getTodos(): Observable<Todo[]> {
  //   return this.http.get<Todo[]>(`${this.todosUrl}${this.todosLimit}`);
  // }
  //
  // // Delete Todo
  // deleteTodo(todo: Todo): Observable<Todo> {
  //   const url = `${this.todosUrl}/${todo.id}`;
  //   return this.http.delete<Todo>(url, httpOptions);
  // }
  //
  // // Add Todo
  // addTodo(todo: Todo): Observable<Todo> {
  //   return this.http.post<Todo>(this.todosUrl, todo, httpOptions);
  // }
  //
  // // Toggle Completed
  // toggleCompleted(todo: Todo): Observable<any> {
  //   const url = `${this.todosUrl}/${todo.id}`;
  //   return this.http.put(url, todo, httpOptions);
  // }
}
