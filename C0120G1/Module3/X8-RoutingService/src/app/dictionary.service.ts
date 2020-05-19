import { Injectable } from '@angular/core';

export interface IWord {
  key: string;
  meaning: string;
}

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  private words: IWord[] = [
    {
      key: 'Nguyễn Đình Hòa',
      meaning: 'Ngôn Phi-TF'
    }, {
      key: 'Trần Ngọc Tân',
      meaning: 'Best Trymdamere'
    }, {
      key: 'Võ Minh Hùng',
      meaning: 'Best Support Lulu'
    }, {
      key: 'Phạm Minh Hưng',
      meaning: 'Best Ad Carry Kalista'
    }, {
      key: 'Nguyễn Đức Thông',
      meaning: 'Best Jungle Elise'
    }
  ];
  constructor() { }

  search(word: string): string {
    if (!word) {
      return '';
    }
    const w = this.words.find(item => item.key === word);
    if (w) {
      return w.meaning;
    }
    return 'Not found';
  }

  getAll(): IWord[] {
    return this.words;
  }
}
