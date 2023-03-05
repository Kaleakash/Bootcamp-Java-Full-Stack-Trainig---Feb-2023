function readData() {
    //alert("event fired")
    // read the value of text field using name attribute 
    // var fname = document.getElementsByName("fullname")[0].value;
    // var lname = document.getElementsByName("fullname")[1].value;
    // var fullname = fname+" "+lname
    // alert("Welcome"+fullname)

    // read the value of text field using id attribute 
    var h1TagLength = document.getElementsByTagName("h1");
    var h1Value = document.getElementsByTagName("h1")[0].innerHTML;
    var fname = document.getElementById("n1").value;
    var lname = document.getElementById("n2").value;
    var fullname = fname+" "+lname
    //alert("Welcome"+fullname)
    document.getElementById("n3").value=fullname;
    document.getElementsByTagName("div")[0].innerHTML=fullname
    document.getElementById("n1").value=""
    document.getElementById("n2").value=""
    alert(h1Value)
    alert("number of h1 tags are "+h1TagLength.length)
}

function domOperation() {
    var pTag = document.createElement("p");             // p tag is ready 
    var pTagContent = document.createTextNode("welcome to dom operation"); // content is ready 
    pTag.appendChild(pTagContent);      // content addded in p tag <p>welcome to dom operation</p>

   // document.getElementById("result").appendChild(pTag);        //<div><p>Welcome to dom operation</p></div>
   document.getElementsByTagName("body")[0].appendChild(pTag);
}








