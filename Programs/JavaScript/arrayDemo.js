var num =[10,20,30,40,50,60];
document.write(num);        // 
num.push(100);      // added at last 
num.push(200);
num.unshift(300);       // added at begining 
num.unshift(400);
document.write("<br/>"+num);        // 
num.pop();          // remove from last 
num.shift();        // remove from begining 
document.write("<br/>"+num);        // 
// add, remove and update element in between in array 
//1st parameter index position , 2nd number of number of element 
//num.splice(3,1);            // 3rd index position remove 1 element 
//num.splice(3,2);            // 3rd index position remove 2 element 
//num.splice(3,1,100);            // 3rd index position element remove by 100
num.splice(3,0,100);                // adding 100 element in 3rd index position 
document.write("<br/>"+num);        // 
// document.write("<br> "+num);
// document.write("<br/> "+num[0])
// document.write("<br/> Using for loop")
// for(var i=0;i<num.length;i++){
//     document.write("<br/> "+num[i])
// }
// document.write("<br/> display element using callback")
// num.forEach(display)

// function display(v,i){
//     document.write("<br/> "+v+" "+i);
// }

// num.forEach(function(v,i){
//     document.write("<br/> "+v+" "+i)
// })

// num.forEach((v,i)=>document.write("<br/>"+v+" "+i))
// document.write("<br/> for in loop")
// for(var i in num){
//     document.write("<br/> index position"+i+" Value "+num[i])
// }
// document.write("<br/> for of loop");
// for(var n of num){                  //<div *ngFor="let n of num">{{n}}</div>
//     document.write("<br/>Value is "+n)
// }




