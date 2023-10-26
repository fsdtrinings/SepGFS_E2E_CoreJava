import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'abc' })
export class MyNewPipe implements PipeTransform {
  transform(value: any, ...args: any[]) {
    let data = value + '';
    data = '[' + value + ']';
    return data;
  }
}
