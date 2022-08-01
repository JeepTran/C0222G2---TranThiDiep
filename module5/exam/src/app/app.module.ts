import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './common/footer/footer.component';
import { HeaderComponent } from './common/header/header.component';
import { HomeComponent } from './common/home/home.component';
import { TestComponent } from './test/test.component';
import { ProductBlockListComponent } from './block/product-block-list/product-block-list.component';
import { ProductBlockCreateComponent } from './block/product-block-create/product-block-create.component';
import {ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {HttpClientModule} from '@angular/common/http';
import {ToastRef, ToastrModule, ToastrService} from 'ngx-toastr';
import { ProductBlockEditComponent } from './block/product-block-edit/product-block-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    TestComponent,
    ProductBlockListComponent,
    ProductBlockCreateComponent,
    ProductBlockEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    HttpClientModule,
    ToastrModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
