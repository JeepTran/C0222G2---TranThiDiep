import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FacilityListComponent } from './facility/facility-list/facility-list.component';
import { FacilityCreateComponent } from './facility/facility-create/facility-create.component';
import { FacilityEditComponent } from './facility/facility-edit/facility-edit.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { ContractListComponent } from './contract/contract-list/contract-list.component';
import { ContractCreateComponent } from './contract/contract-create/contract-create.component';
import { VillaEditComponent } from './facility/facility-edit/villa-edit/villa-edit.component';
import { HouseEditComponent } from './facility/facility-edit/house-edit/house-edit.component';
import { RoomEditComponent } from './facility/facility-edit/room-edit/room-edit.component';
import { VillaCreateComponent } from './facility/facility-create/villa-create/villa-create.component';
import { HouseCreateComponent } from './facility/facility-create/house-create/house-create.component';
import { RoomCreateComponent } from './facility/facility-create/room-create/room-create.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    FacilityListComponent,
    FacilityCreateComponent,
    FacilityEditComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    ContractListComponent,
    ContractCreateComponent,
    VillaEditComponent,
    HouseEditComponent,
    RoomEditComponent,
    VillaCreateComponent,
    HouseCreateComponent,
    RoomCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
