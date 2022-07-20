import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VillaCreateComponent } from './villa-create.component';

describe('VillaCreateComponent', () => {
  let component: VillaCreateComponent;
  let fixture: ComponentFixture<VillaCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VillaCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VillaCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
