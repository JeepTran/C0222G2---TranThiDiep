import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThucHanhNamecardComponent } from './thuc-hanh-namecard/thuc-hanh-namecard.component';
import { ThucHanhProgressBarComponent } from './thuc-hanh-progress-bar/thuc-hanh-progress-bar.component';
import { BaiTapRatingBarComponent } from './bai-tap-rating-bar/bai-tap-rating-bar.component';
import { RatingComponent } from './bai-tap-rating-bar/rating/rating.component';
import { BaiTapCountdownTimerComponent } from './bai-tap-countdown-timer/bai-tap-countdown-timer.component';

@NgModule({
  declarations: [
    AppComponent,
    ThucHanhNamecardComponent,
    ThucHanhProgressBarComponent,
    BaiTapRatingBarComponent,
    RatingComponent,
    BaiTapCountdownTimerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
