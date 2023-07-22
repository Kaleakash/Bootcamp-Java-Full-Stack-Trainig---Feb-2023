import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  // transform(value: any, ...args: unknown[]): unknown {
  //   console.log(value)
  //   return value.toUpperCase();
  //   //return value.substring(2,4);
  // }

  transform(obj: any, key:any): any {
    console.log(obj)
    //console.log(key);
    //let result = obj.filter((p:any)=>p.title==key);
    let result = obj.filter((p:any)=>p.title.toUpperCase().startsWith(key.toUpperCase()));
    // if(result.length==0){
    //   return obj;
    // }else {
    //   return result;
    // }
    return result;
    
    //return value.substring(2,4);
  }
}
