import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-bai-tap-calculator',
  templateUrl: './bai-tap-calculator.component.html',
  styleUrls: ['./bai-tap-calculator.component.css']
})
export class BaiTapCalculatorComponent implements OnInit {
  firstNum = 0;
  secondNum = 0;
  operator: string;
  result: any;

  constructor() {
  }

  ngOnInit(): void {
  }

  calculate(firstNum, secondNum, operator) {
    switch (operator) {
      case 'add':
        this.result = firstNum + secondNum;
        break;
      case 'subtract':
        this.result = firstNum - secondNum;
        break;
      case 'multiply':
        this.result = firstNum * secondNum;
        break;
      case 'divide':
        if (secondNum !== 0) {
          this.result = firstNum / secondNum;
        } else {
          this.result = 'Cannot be divided by 0!';
        }
        break;
      default :
        this.result = 'Please enter enough numbers and operator.';
    }
  }

}
