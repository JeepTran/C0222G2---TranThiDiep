import {Component, EventEmitter, OnDestroy, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-bai-tap-countdown-timer',
  templateUrl: './bai-tap-countdown-timer.component.html',
  styleUrls: ['./bai-tap-countdown-timer.component.css']
})
export class BaiTapCountdownTimerComponent implements OnInit, OnDestroy {
  time = 5;
  remainingTime: number;
  message = '';
  @Output() finish = new EventEmitter<boolean>();
  intervalId = 0;

  clearTimer() {
    clearInterval(this.intervalId);
  }

  start() {
    this.countdown();
    if (this.remainingTime <= 0) {
      this.reset();
    }
  }

  stop() {
    this.clearTimer();
    this.message = 'Holding at ' + this.remainingTime + 'seconds.';
  }

  reset() {
    this.clearTimer();
    this.remainingTime = this.time;
    this.message = 'CLick start button to start the countdown.';
  }

  constructor() {
  }

  ngOnInit(): void {
  }

  private countdown() {
    this.clearTimer();
    this.remainingTime = this.time;
    this.intervalId = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.message = 'Blast off!';
        this.clearTimer();
        this.finish.emit(true);
      }
    }, 1000);
  }

  ngOnDestroy(): void {
    this.clearTimer();
  }


}
