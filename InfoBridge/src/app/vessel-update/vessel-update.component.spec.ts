import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VesselUpdateComponent } from './vessel-update.component';

describe('VesselUpdateComponent', () => {
  let component: VesselUpdateComponent;
  let fixture: ComponentFixture<VesselUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VesselUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VesselUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
