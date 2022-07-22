import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapFormDangKyComponent } from './bai-tap-form-dang-ky.component';

describe('BaiTapFormDangKyComponent', () => {
  let component: BaiTapFormDangKyComponent;
  let fixture: ComponentFixture<BaiTapFormDangKyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapFormDangKyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapFormDangKyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
