import {Component, EventEmitter, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-bai-tap-form-dang-nhap',
  templateUrl: './bai-tap-form-dang-nhap.component.html',
  styleUrls: ['./bai-tap-form-dang-nhap.component.css']
})
export class BaiTapFormDangNhapComponent implements OnInit {
  loginForm: FormGroup;
  submitLogin = new EventEmitter();

  constructor() {
    this.loginForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)])
    });
  }

  ngOnInit(): void {
  }

  login() {
    if (this.loginForm.valid) {
      this.submitLogin.emit(this.loginForm.value);
    }
  }
}
