import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-bai-tap-color-picker',
  templateUrl: './bai-tap-color-picker.component.html',
  styleUrls: ['./bai-tap-color-picker.component.css']
})
export class BaiTapColorPickerComponent implements OnInit {
  color: string;

  constructor() {
  }

  ngOnInit(): void {
  }

}
