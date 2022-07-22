import {Component, EventEmitter, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-bai-tap-form-dang-ky',
  templateUrl: './bai-tap-form-dang-ky.component.html',
  styleUrls: ['./bai-tap-form-dang-ky.component.css']
})
export class BaiTapFormDangKyComponent implements OnInit {
  userRegisterForm: FormGroup;
  submitRegister = new EventEmitter();
  countries: string[] = [];

  constructor() {
    this.countries = ['Vietnam', 'USA', 'France', 'Japan', 'Korea'];

    this.userRegisterForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      matchPassword: new FormGroup({
          password: new FormControl('', [Validators.required, Validators.minLength(6)]),
          confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)])
        },
        this.customValidateConfirmPassword),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84[0-9]{9,10}$')])
    });
  }

  customValidateConfirmPassword(matchPassword: AbstractControl) {
    let value;
    value = matchPassword.value;
    if (value.password !== value.confirmPassword) {
      return {'error': true};
    }
    return null;
  }

  registerUser() {
    if (this.userRegisterForm.valid) {
      this.submitRegister.emit(this.userRegisterForm.value);
    }
  }

  ngOnInit(): void {
  }

}
