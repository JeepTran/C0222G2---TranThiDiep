import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapColorPickerComponent } from './bai-tap-color-picker.component';

describe('BaiTapColorPickerComponent', () => {
  let component: BaiTapColorPickerComponent;
  let fixture: ComponentFixture<BaiTapColorPickerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapColorPickerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapColorPickerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
