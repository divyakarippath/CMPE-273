/**
 * 
 */

function sortNames(){
	names = [];
	names.push(document.getElementById('name1').value);
	names.push(document.getElementById('name2').value);
	names.push(document.getElementById('name3').value);
	names.sort();
	document.write("<b>Names in Alphabetical Order</b><br>");
	for(i=0;i<names.length;i++){
		document.write(names[i]);
		document.write("<br>");
	}
}
