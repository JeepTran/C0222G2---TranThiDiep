import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TimelinesComponent} from "./timelines-counting/timelines/timelines.component";
import {YoutubePlaylistComponent} from "./song-management/youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./song-management/youtube-player/youtube-player.component";
import {ProductListComponent} from "./product-management/product/product-list/product-list.component";
import {ProductCreateComponent} from "./product-management/product/product-create/product-create.component";
import {DictionaryPageComponent} from "./dictionary/dictionary-page/dictionary-page.component";
import {DictionaryDetailComponent} from "./dictionary/dictionary-detail/dictionary-detail.component";
import {ProductEditComponent} from "./product-management/product/product-edit/product-edit.component";
import {ProductDeleteComponent} from "./product-management/product/product-delete/product-delete.component";


const routes: Routes = [
  // song management
  {path:'timelines', component:TimelinesComponent},
  {path:'youtube', component:YoutubePlaylistComponent,
  children:[{
    path: ':id',
    component: YoutubePlayerComponent
  }]},

  // product management
  {path:'product/list',component:ProductListComponent},
  {path:'product/create',component:ProductCreateComponent},
  {path:'product/edit/:id',component:ProductEditComponent},
  {path:'product/delete/:id',component:ProductDeleteComponent},

  // dictionary management
  {path:'dictionary',component:DictionaryPageComponent,
    children:[{
    path: ':word',
      component: DictionaryDetailComponent
    }]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
