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

@NgModule({
  declarations: [
    AppComponent,
    LongVesselRecordComponent,
    ShortVesselRecordComponent,
    VesselListComponent,
    VesselUpdateComponent
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
