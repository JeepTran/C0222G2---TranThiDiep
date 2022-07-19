import {Component, OnInit} from '@angular/core';
import {Pet} from './pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name : 'Lu Lu',
    image : 'https://www.thedogandfriends.com/assets/img/index/img-hero_dog.png'
  };

  constructor() {
  }

  ngOnInit(): void {
  }

}
