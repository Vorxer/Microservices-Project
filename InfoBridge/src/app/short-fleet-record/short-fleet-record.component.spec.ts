import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShortFleetRecordComponent } from './short-fleet-record.component';

describe('ShortFleetRecordComponent', () => {
  let component: ShortFleetRecordComponent;
  let fixture: ComponentFixture<ShortFleetRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShortFleetRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShortFleetRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
