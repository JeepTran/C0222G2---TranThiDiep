import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-thuc-hanh-progress-bar',
  templateUrl: './thuc-hanh-progress-bar.component.html',
  styleUrls: ['./thuc-hanh-progress-bar.component.css']
})
export class ThucHanhProgressBarComponent implements OnInit {

  @Input() backgroundColor = '#D9D9D9';
  @Input() progressColor = '#4CAF50';
  @Input() progress = 0;

  loading() {
    const interval = setInterval(() => {
      this.progress = +this.progress + 1;
      if (this.progress === 100) {
        clearInterval(interval);
      }
    }, 10);
  }

  constructor() {
  }

  ngOnInit(): void {
    this.loading();
  }


}
