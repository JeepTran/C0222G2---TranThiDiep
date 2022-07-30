import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './common/home/home.component';
import {ProductBlockListComponent} from './block/product-block-list/product-block-list.component';
import {ProductBlockCreateComponent} from './block/product-block-create/product-block-create.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'block', component: ProductBlockListComponent},
  {path: 'importBlock', component: ProductBlockCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}