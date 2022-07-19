import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListUsingBootstrapComponent } from './product-list-using-bootstrap.component';

describe('ProductListUsingBootstrapComponent', () => {
  let component: ProductListUsingBootstrapComponent;
  let fixture: ComponentFixture<ProductListUsingBootstrapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductListUsingBootstrapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductListUsingBootstrapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
