/**
 * 
 */

function getSum(data){
	var sum =0;
	for(var i=0;i<data.length;i++){
		if(typeof data[i] == 'string'){
			sum = sum+Number(data[i]);
		}
		else{
			sum = sum+data[i];
		}	
	}
	return sum;
}

var data = [5,10,"3",4,"8"];
var result = getSum(data);
document.write("Sum of the array elements is : "+ result.toString());
