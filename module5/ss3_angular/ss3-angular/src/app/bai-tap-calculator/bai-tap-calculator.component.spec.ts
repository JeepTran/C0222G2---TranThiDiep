import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapCalculatorComponent } from './bai-tap-calculator.component';

describe('BaiTapCalculatorComponent', () => {
  let component: BaiTapCalculatorComponent;
  let fixture: ComponentFixture<BaiTapCalculatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapCalculatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapCalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
