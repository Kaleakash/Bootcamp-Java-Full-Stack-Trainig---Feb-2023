function addData() {
   var pTag = document.createElement("p");              // <p></p>
   var pTagContent = document.createTextNode("Welcome to Simple Web Page");     // contents ready 
   pTag.appendChild(pTagContent);               //<p>Welcome to simple web page</p>

   document.getElementById("output").appendChild(pTag);     // added p tag inside div tag using id selector 
}

var b1= document.getElementById("b1");
b1.addEventListener("click",function(){
    alert("event generated...")
})