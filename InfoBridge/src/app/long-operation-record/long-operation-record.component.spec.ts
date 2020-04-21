import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LongOperationRecordComponent } from './long-operation-record.component';

describe('LongOperationRecordComponent', () => {
  let component: LongOperationRecordComponent;
  let fixture: ComponentFixture<LongOperationRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LongOperationRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LongOperationRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
