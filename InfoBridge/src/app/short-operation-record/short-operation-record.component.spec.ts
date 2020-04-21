import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShortOperationRecordComponent } from './short-operation-record.component';

describe('ShortOperationRecordComponent', () => {
  let component: ShortOperationRecordComponent;
  let fixture: ComponentFixture<ShortOperationRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShortOperationRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShortOperationRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
