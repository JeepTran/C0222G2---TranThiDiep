import { Component, OnInit } from '@angular/core';
declare var $: any;
@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  showDes() {
    $('#des').css('display', 'block')
    $('#btnDes').attr('class','active nav-item nav-link')
    $('#btnSpec').attr('class','nav-item nav-link text-primary')
    $('#spec').css('display', 'none')
  }

  showSpec() {
    $('#des').css('display', 'none')
    $('#btnDes').attr('class','nav-item nav-link text-primary')
    $('#btnSpec').attr('class','active nav-item nav-link')
    $('#spec').css('display', 'block')
  }
}
