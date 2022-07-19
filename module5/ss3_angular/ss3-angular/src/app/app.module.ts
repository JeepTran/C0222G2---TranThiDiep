import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';
import { PetComponent } from './pet/pet.component';
import {FormsModule} from '@angular/forms';
import { ProductListUsingBootstrapComponent } from './product-list-using-bootstrap/product-list-using-bootstrap.component';
import { BaiTapCalculatorComponent } from './bai-tap-calculator/bai-tap-calculator.component';
import { BaiTapColorPickerComponent } from './bai-tap-color-picker/bai-tap-color-picker.component';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    PetComponent,
    ProductListUsingBootstrapComponent,
    BaiTapCalculatorComponent,
    BaiTapColorPickerComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
