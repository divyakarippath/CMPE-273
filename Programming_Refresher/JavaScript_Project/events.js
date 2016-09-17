/**
 * 
 */

function validateEmail(){
	email = document.getElementById('email').value;
	atIndex = email.indexOf('@');
	dotIndex = email.lastIndexOf('.');
	if(atIndex<1 || dotIndex<atIndex+2 ||dotIndex+2 >=email.length)
		document.getElementById("result").innerHTML = "You have entered an invalid email address! Please reenter";
	else
		document.getElementById("result").innerHTML = "The email address entered is valid";
}