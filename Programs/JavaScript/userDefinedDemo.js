// literal style object creation 
var emp = {id:100,name:"John",age:21};
document.write("<br/> Object creation in literal style")
document.write("<br/> id is "+emp.id);
document.write("<br/> Name is "+emp.name);
document.write("<br/> age is "+emp.age);
// function style object creation 
// JSON : JavaScript object notation 
// till ES5 we are/were using function style 
function Employee() {
    this.id =100;
    this.name = "Ravi";
    var age = 21;   // local varible consider 
    this.display= function() {
        document.write("<br/> function style object creation")
        document.write("<br/> Id is "+this.id);
        document.write("<br/> name is "+this.name);
    }
}
//Employee();
var emp1 = new Employee();      // we created memory 
emp1.display();
document.write("<br/> id is "+emp1.id)
document.write("<br/> name is "+emp1.name)
document.write("<br/> age is "+emp1.age)
// class style 
class Customer {
    cid=101;
    cname="Ajay";  
    display() {
        document.write("<br/> object creation in class style")
        document.write("<br/> id is "+this.cid);
        document.write("<br/> name is "+this.cname)
    } 
}
let cust1 = new Customer();
cust1.display();
document.write("id is "+cust1.cid)




