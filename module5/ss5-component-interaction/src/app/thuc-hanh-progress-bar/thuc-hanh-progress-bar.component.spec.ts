import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhProgressBarComponent } from './thuc-hanh-progress-bar.component';

describe('ThucHanhProgressBarComponent', () => {
  let component: ThucHanhProgressBarComponent;
  let fixture: ComponentFixture<ThucHanhProgressBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhProgressBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhProgressBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
