import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-bai-tap-rating-bar',
  templateUrl: './bai-tap-rating-bar.component.html',
  styleUrls: ['./bai-tap-rating-bar.component.css']
})
export class BaiTapRatingBarComponent implements OnInit {
  units: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  value: number;

  constructor() {
  }

  ngOnInit(): void {
  }

  getValue(unit: number) {
    this.value = unit;
  }
}
