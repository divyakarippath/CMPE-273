/** 
 * 
 */
var inrValue = prompt("Please enter the value in INR\n");
var exRate = 66.48;
var dollar = inrValue/exRate;
document.getElementById("result").innerHTML = "Dollar value for INR "+inrValue+ " is: "+dollar.toFixed(2);