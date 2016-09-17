/**
 * 
 */

var employee={
		name: prompt("Name: \n"),
		age: prompt("Age: \n"),
		gender: prompt("Gender: \n"),
		city: prompt("City: \n")
};

document.write("Profile Information:<br><br>");
document.write("Name:\t"+employee.name+"<br>");
document.write("Age:\t"+employee.age+"<br>");
document.write("Gender:\t"+employee.gender+"<br>");
document.write("City:\t"+employee.city);