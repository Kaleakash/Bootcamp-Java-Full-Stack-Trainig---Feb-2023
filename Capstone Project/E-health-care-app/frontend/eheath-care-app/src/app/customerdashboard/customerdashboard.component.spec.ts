import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerdashboardComponent } from './customerdashboard.component';

describe('CustomerdashboardComponent', () => {
  let component: CustomerdashboardComponent;
  let fixture: ComponentFixture<CustomerdashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomerdashboardComponent]
    });
    fixture = TestBed.createComponent(CustomerdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
