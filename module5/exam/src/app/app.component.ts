import {Component} from '@angular/core';
import {ProductBlock} from './model/product-block';
import {ProductBlockService} from './service/product-block.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'exam';

  public productBlocks: ProductBlock[] = [];

  constructor(private productBlockService: ProductBlockService) {
  }

  getAllProductBlock() {
    this.productBlockService.getAllProductBlocks().subscribe(
      data => {
        this.productBlocks = data;
      }, error => {
        console.log(error);
      }
    );
  }


}
