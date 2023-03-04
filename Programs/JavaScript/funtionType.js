// normal type function no passing parameter and no return type 
info();

function info() {
    document.write("<br/> Normal style function")
}

info();
// function passing two parameter but no return type. 
function add(a,b){
    var sum = a+b;
    document.write("<br/>sum of two number is "+sum)
}

add(10,20);
add(1,2);
add(100,200);

// funtion passing parameter and return value 
function sayHello(name) {
    // coding...
    return "Welcome user "+name;
}
document.write("<br/>")
document.write(sayHello("Ajay"));

// expression function 
var dis= function display() {
            document.write("<br/>this is display function")
        }

//display();
dis();
//display1();

var display1 = function() {
    document.write("<br/>This is expression style function")
}
display1();

// arrow function 
var display2 = ()=>document.write("<br/>Arrow function");
display2();


// addition of two number using expression function 
var addNumber1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br/> Addition of two number using expression style "+addNumber1(100,200));
// addition of two number using arrow function 
// arrow fuction return result without return keyword. 
var addNumber2 = (a,b)=>a+b;
document.write("<br> Addition of two number using arrow function "+addNumber2(100,200));

// find largest using expression style 
var findLargest1 = function(a,b){
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}
// find largest using arrow style in arrow if we want to write multi line statement we have to use curly 
//braces and we need to return result using return keyword. 
var findLargest2 = (a,b)=>{
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}


// callback function 
// passing function name or function body or function itself to another function as a parameter 
// is known as callback.

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
var maleInfo = function(fname){
    return "Mr "+fname;
}
var femaleInfo = (fname)=>"Miss "+fname;

document.write("<br/> "+greeting("Ajay",maleInfo));
document.write("<br/>"+greeting("Seeta",femaleInfo));
document.write("<br/> "+greeting("Vijay",function(fname){
    return "Mr "+fname;
}));

document.write("<br/> "+greeting("Meeta",(fname)=>"Miss "+fname));


