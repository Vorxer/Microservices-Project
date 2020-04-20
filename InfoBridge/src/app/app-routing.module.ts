import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VesselListComponent} from './vessel-list/vessel-list.component';
import {LongVesselRecordComponent} from './long-vessel-record/long-vessel-record.component';
import {VesselUpdateComponent} from './vessel-update/vessel-update.component';
import {FleetListComponent} from './fleet-list/fleet-list.component';
import {LongFleetRecordComponent} from './long-fleet-record/long-fleet-record.component';
import {FleetUpdateComponent} from './fleet-update/fleet-update.component';

const routes: Routes = [
  { path: 'vessels', component: VesselListComponent },
  { path: 'fleets', component: FleetListComponent },
  { path: 'vesselRecord/:vid', component: LongVesselRecordComponent},
  { path: 'fleetRecord/:fid', component: LongFleetRecordComponent},
  { path: 'vesselUpdate/:vid', component: VesselUpdateComponent},
  { path: 'fleetUpdate/:vid', component: FleetUpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
