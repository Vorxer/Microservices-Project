import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShortVesselRecordComponent } from './short-vessel-record.component';

describe('ShortVesselRecordComponent', () => {
  let component: ShortVesselRecordComponent;
  let fixture: ComponentFixture<ShortVesselRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShortVesselRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShortVesselRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
