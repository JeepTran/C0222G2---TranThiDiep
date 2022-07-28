import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {TimelinesComponent} from './timelines-counting/timelines/timelines.component';

import {YoutubePlaylistComponent} from './song-management/youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './song-management/youtube-player/youtube-player.component';

import {DictionaryPageComponent} from './dictionary/dictionary-page/dictionary-page.component';
import {DictionaryDetailComponent} from './dictionary/dictionary-detail/dictionary-detail.component';

import {ReactiveFormsModule} from "@angular/forms";
import {ProductManagementComponent} from './product-management/product-management.component';
import {ProductListComponent} from './product-management/product/product-list/product-list.component';
import {ProductCreateComponent} from './product-management/product/product-create/product-create.component';
import {ProductEditComponent} from './product-management/product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './product-management/product/product-delete/product-delete.component';
import { CategoryListComponent } from './product-management/categories/category-list/category-list.component';
import { CategoryCreateComponent } from './product-management/categories/category-create/category-create.component';
import { CategoryEditComponent } from './product-management/categories/category-edit/category-edit.component';
import { CategoryDeleteComponent } from './product-management/categories/category-delete/category-delete.component';
import {HttpClientModule} from "@angular/common/http";

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
    ProductDeleteComponent,
    CategoryListComponent,
    CategoryCreateComponent,
    CategoryEditComponent,
    CategoryDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
