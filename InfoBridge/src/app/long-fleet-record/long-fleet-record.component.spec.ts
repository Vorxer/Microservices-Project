import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LongFleetRecordComponent } from './long-fleet-record.component';

describe('LongFleetRecordComponent', () => {
  let component: LongFleetRecordComponent;
  let fixture: ComponentFixture<LongFleetRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LongFleetRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LongFleetRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
