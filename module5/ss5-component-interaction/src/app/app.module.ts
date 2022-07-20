import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThucHanhNamecardComponent } from './thuc-hanh-namecard/thuc-hanh-namecard.component';
import { ThucHanhProgressBarComponent } from './thuc-hanh-progress-bar/thuc-hanh-progress-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    ThucHanhNamecardComponent,
    ThucHanhProgressBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
