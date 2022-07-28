import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerService} from "../../service/customer.service";
import {FormControl, FormGroup} from "@angular/forms";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  id: number;
  name: string;
  phone: string;
  p: number = 1;
  searchForm: FormGroup;

  constructor(private customerService: CustomerService, private toastrService: ToastrService) {
    this.getCustomerList();
  }

  ngOnInit(): void {
    this.getCustomerList();
  }

  getCustomerList() {
    this.customerService.getAllCustomer().subscribe(data => {
      this.customers = data;
      this.getSearchForm();
    }, error => {
      console.log(error);
    });
  }

  getSearchForm() {
    // this.getCustomerList();
    this.searchForm = new FormGroup({
      searchName: new FormControl(""),
      searchIdCard: new FormControl("")
    })
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.id).subscribe(data => {
      this.showToastr();
      this.ngOnInit();
    }, error => {
      console.log(error);
    })
  }

  sendId(id: number, name: string, phone: string) {
    this.id = +id;
    this.name = name;
    this.phone = phone;
  }

  search() {
    const name = this.searchForm.value.searchName;
    const idCard = this.searchForm.value.searchIdCard;
    this.customerService.searchCustomerByNameAndIdCard(name,idCard).subscribe(data => {
        this.customers = data;
      }, error => {
        console.log(error);
      }
    );
  }

  showToastr() {
    this.toastrService.warning("Delete customer successfully!", "Announce",{
      timeOut:2000,
      progressBar:true
    });
  }
}
