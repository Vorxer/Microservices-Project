import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VesselListComponent} from './vessel-list/vessel-list.component';
import {LongVesselRecordComponent} from './long-vessel-record/long-vessel-record.component';

const routes: Routes = [
  { path: 'vessels', component: VesselListComponent },
  { path: 'vesselRecord/:vid', component: LongVesselRecordComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
