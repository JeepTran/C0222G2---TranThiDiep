import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhTodoComponent } from './thuc-hanh-todo.component';

describe('ThucHanhTodoComponent', () => {
  let component: ThucHanhTodoComponent;
  let fixture: ComponentFixture<ThucHanhTodoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhTodoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhTodoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
