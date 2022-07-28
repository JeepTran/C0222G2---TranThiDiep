import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../service/customer.service";
import {FormControl, FormGroup} from "@angular/forms";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerType} from "../../model/customer-type";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customerForm: FormGroup;
  id: number;
  customerTypes: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getCustomer(this.id);
    });
  }

  ngOnInit(): void {
    this.customerService.getAllCustomerType().subscribe(
      types => {
        this.customerTypes = types;
      }, error => {
        console.log(error);
      }
    )
  }

  getCustomer(id: number) {
    return this.customerService.getCustomerById(id).subscribe(customer => {
      this.customerForm = new FormGroup({
          id: new FormControl(customer.id),
          name: new FormControl(customer.name),
          dob: new FormControl(customer.dob),
          gender: new FormControl(customer.gender),
          customerType: new FormControl(customer.customerType),
          idCard: new FormControl(customer.idCard),
          phone: new FormControl(customer.phone),
          email: new FormControl(customer.email),
          address: new FormControl(customer.address)
        }
      )
    }, error => {
      console.log(error);
    })
  }


  submit() {
    const customer = this.customerForm.value;
    customer.gender = +customer.gender;
    this.customerService.editCustomer(this.id, customer).subscribe(() => {
      console.log("Edit successfully!");
    }, e => {
      console.log(e);
    }, () => {
      this.router.navigate(["/customer/list"]);
    })
  }

  compareCustomerType(type1: CustomerType, type2: CustomerType): boolean {
    return type1.id === type2.id;
  }

}
