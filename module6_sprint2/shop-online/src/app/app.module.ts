import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {LoginComponent} from './login/login.component';
import {HomeComponent} from './home/home.component';
import {DetailComponent} from './detail/detail.component';
import {CartComponent} from './cart/cart.component';
import {ProductDescriptionComponent} from './detail/product-description/product-description.component';
import {ProductSpecificationComponent} from './detail/product-specification/product-specification.component';
import {LogoutComponent} from './logout/logout.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";
import {LoginModule} from "./login/login.module";
import {LoginRoutingModule} from "./login/login-routing.module";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    HomeComponent,
    DetailComponent,
    CartComponent,
    ProductDescriptionComponent,
    ProductSpecificationComponent,
    LogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(
      {
        timeOut: 2000,
        closeButton: true,
        progressBar: true,
        positionClass: 'toast-top-left',
        preventDuplicates: true,
      }
    ),
    LoginModule,
    LoginRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
