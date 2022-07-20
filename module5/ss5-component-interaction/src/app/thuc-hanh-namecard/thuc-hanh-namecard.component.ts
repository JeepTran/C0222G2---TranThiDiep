import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-thuc-hanh-namecard',
  templateUrl: './thuc-hanh-namecard.component.html',
  styleUrls: ['./thuc-hanh-namecard.component.css']
})
export class ThucHanhNamecardComponent implements OnInit {
@Input() cardName: string;
@Input() email: string;
@Input() phone: string;

  constructor() { }

  ngOnInit(): void {
  }

}
