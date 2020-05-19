import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  playlist = [
    {id: 'Gj9DnnWou_w', song: 'Yêu Anh-Vương Tâm Lãng'},
    {id: 'rz0WgSs7ueo', song: 'Hiệp khách giang hồ'},
    {id: 'LRsr1ziNZJ0', song: 'Detective Conan'},
    {id: 'OuKa--TYjcc', song: 'Nhất vũ khuynh thành-Lâm An sơ vũ'},
    {id: 'k1hoEv16HGc', song: 'Wakaba-Four-leaf Clover'}
  ];
  constructor() { }
  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
