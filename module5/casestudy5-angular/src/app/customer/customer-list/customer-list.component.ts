import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerType} from "../../model/customer-type";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  customerTypes: CustomerType[] = [];

  constructor() {
    this.customerTypes.push({
      id: 1,
      customerType: "Diamond"
    }, {
      id: 2,
      customerType: "Platinum"
    }, {
      id: 3,
      customerType: "Gold"
    }, {
      id: 4,
      customerType: "Silver"
    }, {
      id: 5,
      customerType: "Member"
    },);

    this.customers.push({
      id: 1,
      name: "Nguyễn Văn A",
      dob: '1990-05-01',
      gender: 1,
      customerType: this.customerTypes[1],
      idCard: "111111111",
      phone: "0901000000",
      email: "a@gmail.com",
      address: "Đà Nẵng"
    },
      {
      id: 2,
      name: "Nguyễn Văn Ba",
      dob: '1995-04-01',
      gender: 2,
      customerType: this.customerTypes[0],
      idCard: "222222222",
      phone: "0901000002",
      email: "b@gmail.com",
      address: "Hà Nội"
    },
      {
      id: 3,
      name: "Nguyễn Ca",
      dob: '1997-12-01',
      gender: 0,
      customerType: this.customerTypes[3],
      idCard: "333333333",
      phone: "0901000003",
      email: "c@gmail.com",
      address: "Quảng Nam"
    },
      )
  }

  ngOnInit(): void {
  }

}
