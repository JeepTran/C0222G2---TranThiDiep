import {Component, OnInit} from '@angular/core';
import {Facility} from "../../model/facility";

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  facilities: Facility[] = [];

  constructor() {

    this.facilities.push({
        id: '1',
        name: 'Villa 1',
        area: 200,
        cost: 10000000,
        maxPeople: 10,
        rentType: 'days',
        roomStandard: 'Vip',
        otherConvenience: 'BBQ in garden',
        poolArea: 50,
        numberOfFloor: 3
      },
      {
        id: '2',
        name: 'House 1',
        area: 100,
        cost: 5000000,
        maxPeople: 4,
        rentType: 'days',
        roomStandard: 'Luxury',
        otherConvenience: 'BBQ in garden',
        numberOfFloor: 2
      },
      {
        id: '3',
        name: 'Room 1',
        area: 70,
        cost: 2000000,
        maxPeople: 2,
        rentType: 'days',
        freeFacility: 'Welcoming fruit'
      })
  }

  ngOnInit(): void {
  }

}
