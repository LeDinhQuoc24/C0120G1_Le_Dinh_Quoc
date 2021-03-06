// @ts-ignore
import {NgModule} from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';
import {TimeLifeComponent} from "./time-life/time-life.component";
import {YoutubePlaylistComponent} from "./youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./youtube-player/youtube-player.component";
import {DictionaryPageComponent} from "./dictionary-page/dictionary-page.component";
import {DictionaryDetailComponent} from "./dictionary-detail/dictionary-detail.component";
import {AuthGuard} from "./auth.guard";

const routes: Routes = [
  {path: "timelines", component: TimeLifeComponent},
  { path: 'youtube',
    component: YoutubePlaylistComponent,
    children:[{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {path: "dictionary", component: DictionaryPageComponent,
  children:[{
    path:':key',component: DictionaryDetailComponent,
    canActivate: [AuthGuard]
  }]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
