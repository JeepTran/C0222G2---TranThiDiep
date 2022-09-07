import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {HeaderComponent} from "./header/header.component";
import {FooterComponent} from "./footer/footer.component";
import {LoginComponent} from "./login/login.component";
import {DetailComponent} from "./detail/detail.component";
import {CartComponent} from "./cart/cart.component";
import {ProductDescriptionComponent} from "./detail/product-description/product-description.component";
import {ProductSpecificationComponent} from "./detail/product-specification/product-specification.component";
import {LogoutComponent} from "./logout/logout.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'header', component: HeaderComponent},
  {path: 'footer', component: FooterComponent},
  {path: 'login', component: LoginComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'cart', component: CartComponent},
  {path: 'description', component: ProductDescriptionComponent},
  {path: 'specification', component: ProductSpecificationComponent},
  {path: 'logout', component: LogoutComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
