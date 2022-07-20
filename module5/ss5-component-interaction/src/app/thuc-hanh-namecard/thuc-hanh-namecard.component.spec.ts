import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhNamecardComponent } from './thuc-hanh-namecard.component';

describe('ThucHanhNamecardComponent', () => {
  let component: ThucHanhNamecardComponent;
  let fixture: ComponentFixture<ThucHanhNamecardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhNamecardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhNamecardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
