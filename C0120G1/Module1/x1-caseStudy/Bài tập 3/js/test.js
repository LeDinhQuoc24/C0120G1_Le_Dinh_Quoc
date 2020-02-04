let name = document.getElementById("name");
let message = document.getElementById("message");
function checkName() {
    if(name.value!=="kien"){
        message.style.display = "block";
        name.style.border = "1px solid red";
        message.style.color = "red";
        message.innerText = "Name is incorect";
    }
    else{
        message.style.display = "none";
        name.style.border = "1px solid black";
    }
}