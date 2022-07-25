import {Injectable} from '@angular/core';
import {Dictionary} from "../model/dictionary";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary: Dictionary[] = [
    {word: 'hello', mean: 'xin chào'},
    {word: 'computer', mean: 'máy tính'},
    {word: 'mouse', mean: 'chuột'},
    {word: 'keyboard', mean: 'bàn phím'},
    {word: 'monitor', mean: 'màn hình'},
    {word: 'speaker', mean: 'loa'},
    {word: 'printer', mean: 'máy in'},
    {word: 'headphone', mean: 'tai nghe'},
  ];

  constructor() {
  }

  getAll() {
    return this.dictionary;
  }

  getDictionaryByWord(findingWord: string) {
    return this.dictionary.find(temp => temp.word === findingWord)
  }
}
