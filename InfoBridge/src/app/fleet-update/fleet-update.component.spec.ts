import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FleetUpdateComponent } from './fleet-update.component';

describe('FleetUpdateComponent', () => {
  let component: FleetUpdateComponent;
  let fixture: ComponentFixture<FleetUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FleetUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FleetUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
