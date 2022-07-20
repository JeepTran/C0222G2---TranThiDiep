import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhHackernewsComponent } from './thuc-hanh-hackernews.component';

describe('ThucHanhHackernewsComponent', () => {
  let component: ThucHanhHackernewsComponent;
  let fixture: ComponentFixture<ThucHanhHackernewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhHackernewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhHackernewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
