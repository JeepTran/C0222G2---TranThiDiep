import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DetailComponent } from './detail/detail.component';
import { CartComponent } from './cart/cart.component';
import { ProductDescriptionComponent } from './detail/product-description/product-description.component';
import { ProductSpecificationComponent } from './detail/product-specification/product-specification.component';
import { LogoutComponent } from './logout/logout.component';
import {ReactiveFormsModule} from "@angular/forms";

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
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
