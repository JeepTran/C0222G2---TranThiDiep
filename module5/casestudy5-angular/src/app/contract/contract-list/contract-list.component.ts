import {Component, OnInit} from '@angular/core';
import {Contract} from "../../model/contract";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contracts: Contract[] = [];

  constructor() {
    this.contracts.push({
      id: 1,
      contractId: "HD001",
      startDate: "2022-07-01",
      endDate: "2022-07-05",
      deposit: 500000,
      totalPayment: 2000000
    },{
        id: 2,
        contractId: "HD002",
        startDate: "2022-07-03",
        endDate: "2022-07-15",
        deposit: 5000000,
        totalPayment: 10000000
      },{
        id: 3,
        contractId: "HD003",
        startDate: "2022-07-10",
        endDate: "2022-07-14",
        deposit: 1000000,
        totalPayment: 3000000
      },{
        id: 4,
        contractId: "HD004",
        startDate: "2022-07-15",
        endDate: "2022-07-17",
        deposit: 1000000,
        totalPayment: 2000000
      })
  }

  ngOnInit(): void {
  }

}
