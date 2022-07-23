import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThucHanhTodoComponent } from './thuc-hanh-todo/thuc-hanh-todo.component';
import {ReactiveFormsModule} from '@angular/forms';
import { BaiTapFormDangKyComponent } from './bai-tap-form-dang-ky/bai-tap-form-dang-ky.component';
import { BaiTapFormDangNhapComponent } from './bai-tap-form-dang-nhap/bai-tap-form-dang-nhap.component';

@NgModule({
  declarations: [
    AppComponent,
    ThucHanhTodoComponent,
    BaiTapFormDangKyComponent,
    BaiTapFormDangNhapComponent
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
