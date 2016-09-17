/**
 * 
 */

function oddOrEven(number){
	if(number%2 == 0)
		return "Even";
	else
		return "Odd";
}

var number = prompt("Enter the number\n"); 
document.getElementById("result").innerHTML = "The given number is "+oddOrEven(number);