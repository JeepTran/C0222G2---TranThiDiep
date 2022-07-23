import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapFormDangNhapComponent } from './bai-tap-form-dang-nhap.component';

describe('BaiTapFormDangNhapComponent', () => {
  let component: BaiTapFormDangNhapComponent;
  let fixture: ComponentFixture<BaiTapFormDangNhapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapFormDangNhapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapFormDangNhapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
