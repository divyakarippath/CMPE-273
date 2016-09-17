/**
 * 
 */

mark = prompt("Enter your mark\n");

var grade;
if (mark >= 90)
	grade = 'A';
else if (mark >= 80)
	grade = 'B';
else if (mark >= 70)
	grade = 'C';
else
	grade = 'F';

switch (grade) {

case 'A':
	document.write("Acdemic standing : Pass with Distinction");
	break;
case 'B':
	document.write("Acdemic standing : Pass with First Class");
	break;
case 'C':
	document.write("Acdemic standing : Pass with Second Class");
	break;
case 'F':
	document.write("Acdemic standing : FAIL");
	break;
default:
	document.write("Acdemic standing : FAIL");
}