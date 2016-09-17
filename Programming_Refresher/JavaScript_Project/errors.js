/**
 * 
 */

function findFactorial(){
	number=document.getElementById("number").value;
	factorial = 1;
	try{
		if(isNaN(number))
			throw "Not a Number";
		else if(number == 0)
			factorial = 1;
		else{
			
			for(var i=1;i<=number;i++){
				factorial = factorial*i;
			}
		}
		document.write("Factorial of "+number+" is "+factorial);	
	}
	catch(error){
		document.write(error);
	}
	
}