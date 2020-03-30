import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LongVesselRecordComponent } from './long-vessel-record.component';

describe('LongVesselRecordComponent', () => {
  let component: LongVesselRecordComponent;
  let fixture: ComponentFixture<LongVesselRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LongVesselRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LongVesselRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
