import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapCountdownTimerComponent } from './bai-tap-countdown-timer.component';

describe('BaiTapCountdownTimerComponent', () => {
  let component: BaiTapCountdownTimerComponent;
  let fixture: ComponentFixture<BaiTapCountdownTimerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapCountdownTimerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapCountdownTimerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
