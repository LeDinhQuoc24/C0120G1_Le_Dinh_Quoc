  // @ts-ignore
  import { BrowserModule } from '@angular/platform-browser';
// @ts-ignore
  import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
  import {AppRoutingModule} from "./app-routing.module";
import { TimeLifeComponent } from './time-life/time-life.component';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';


// @ts-ignore
  @NgModule({
  declarations: [
    AppComponent,
    TimeLifeComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    DictionaryPageComponent,
    DictionaryDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
