import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';
import {CustomerType} from '../../model/customer-type';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerTypes: CustomerType[] = [];
  customerForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl('', [Validators.required,
      Validators.pattern(/^([A-Z][a-z]*( ))*([A-Z][a-z]*)$/)]),
    dob: new FormControl('', [Validators.required, this.ageValidate]),
    gender: new FormControl('', [Validators.required]),
    customerType: new FormControl('', [Validators.required]),
    idCard: new FormControl('', [Validators.required,
      Validators.pattern(/^(\d{9}|\d{12})$/)]),
    phone: new FormControl('', [Validators.required,
      Validators.pattern(/^((\(84\)\+)|0)9(0|1)\d{7}$/)]),
    email: new FormControl('', [Validators.required, Validators.email]),
    address: new FormControl('', [Validators.required]),
  });

  // regex tiếng Việt có dấu Java: /^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$/

  constructor(private customerService: CustomerService, private router: Router) {
  }

  ngOnInit(): void {
    this.customerService.getAllCustomerType().subscribe(data => {
      this.customerTypes = data;
    }, error => {
      console.log(error);
    });
    console.log(this.customerTypes);
  }

  submit() {
    if (this.customerForm.valid) {
      const customer = this.customerForm.value;
      customer.gender = +this.customerForm.controls.gender.value;
      this.customerService.createCustomer(customer).subscribe(() => {
        this.customerForm.reset();
      }, e => {
        console.log(e);
      }, () => this.router.navigateByUrl('/customer/list'))
    }
  }

  ageValidate(dob: AbstractControl) {
    const now = new Date();
    const birthDay = new Date(dob.value);
    const age = now.getFullYear() - birthDay.getFullYear();
    if (age < 18) {
      return {'ageError': true};
    }
    return null;
  }

}
