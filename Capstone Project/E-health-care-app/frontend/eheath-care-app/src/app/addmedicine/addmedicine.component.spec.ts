import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddmedicineComponent } from './addmedicine.component';

describe('AddmedicineComponent', () => {
  let component: AddmedicineComponent;
  let fixture: ComponentFixture<AddmedicineComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddmedicineComponent]
    });
    fixture = TestBed.createComponent(AddmedicineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
