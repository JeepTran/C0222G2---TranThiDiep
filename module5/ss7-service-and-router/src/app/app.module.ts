import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TimelinesComponent } from './timelines-counting/timelines/timelines.component';
import { YoutubePlaylistComponent } from './song-management/youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './song-management/youtube-player/youtube-player.component';
import { ProductManagementComponent } from './product-management/product-management.component';
import { ProductListComponent } from './product-management/product/product-list/product-list.component';
import { ProductCreateComponent } from './product-management/product/product-create/product-create.component';
import {ReactiveFormsModule} from "@angular/forms";
import { DictionaryPageComponent } from './dictionary/dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './dictionary/dictionary-detail/dictionary-detail.component';
import { ProductEditComponent } from './product-management/product/product-edit/product-edit.component';
import { ProductDeleteComponent } from './product-management/product/product-delete/product-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    TimelinesComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    ProductManagementComponent,
    ProductListComponent,
    ProductCreateComponent,
    DictionaryPageComponent,
    DictionaryDetailComponent,
    ProductEditComponent,
    ProductDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
