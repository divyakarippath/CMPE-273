/**
 * 
 */

function searchAndReplace(text){
	var newText = text.replace(/Google/i,"Apple");
	document.write(newText);
}
searchAndReplace("Google is one of the best tech companies to work with<br>");
searchAndReplace("My dream company is google<br>");