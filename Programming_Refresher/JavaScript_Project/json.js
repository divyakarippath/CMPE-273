/**
 * 
 */

var inventory = '{"Items":['+
                         '{"itemName":"Milk","price":"$2"},'+
                         '{"itemName":"Bread","price":"$1"},'+
                         '{"itemName":"Icecream","price":"$5"}'+
                         ']}';

var jsonObject = JSON.parse(inventory);

for(i=0;i<jsonObject.Items.length;i++){
	document.write("Item: "+jsonObject.Items[i].itemName+"<br>Price:"+jsonObject.Items[i].price+"<br><br>");
}