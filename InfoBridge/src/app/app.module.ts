import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LongVesselRecordComponent } from './long-vessel-record/long-vessel-record.component';
import { HttpClientModule} from '@angular/common/http';
import { ShortVesselRecordComponent } from './short-vessel-record/short-vessel-record.component';
import {FormsModule} from '@angular/forms';
import { VesselListComponent } from './vessel-list/vessel-list.component';
import {AppRoutingModule} from './app-routing.module';
import { VesselUpdateComponent } from './vessel-update/vessel-update.component';
import { FleetListComponent } from './fleet-list/fleet-list.component';
import { ShortFleetRecordComponent } from './short-fleet-record/short-fleet-record.component';
import { LongFleetRecordComponent } from './long-fleet-record/long-fleet-record.component';
import { FleetUpdateComponent } from './fleet-update/fleet-update.component';
import { OperationListComponent } from './operation-list/operation-list.component';
import { ShortOperationRecordComponent } from './short-operation-record/short-operation-record.component';
import { LongOperationRecordComponent } from './long-operation-record/long-operation-record.component';
import { OperationUpdateComponent } from './operation-update/operation-update.component';

@NgModule({
  declarations: [
    AppComponent,
    LongVesselRecordComponent,
    ShortVesselRecordComponent,
    VesselListComponent,
    VesselUpdateComponent,
    FleetListComponent,
    ShortFleetRecordComponent,
    LongFleetRecordComponent,
    FleetUpdateComponent,
    OperationListComponent,
    ShortOperationRecordComponent,
    LongOperationRecordComponent,
    OperationUpdateComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
