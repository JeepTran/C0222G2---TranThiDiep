import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapRatingBarComponent } from './bai-tap-rating-bar.component';

describe('BaiTapRatingBarComponent', () => {
  let component: BaiTapRatingBarComponent;
  let fixture: ComponentFixture<BaiTapRatingBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapRatingBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapRatingBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
