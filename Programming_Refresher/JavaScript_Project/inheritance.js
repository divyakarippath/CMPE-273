/**
 * 
 */

function Shape(type){
	this.type = type;
	this.area=0;
}

Shape.prototype.display = function(){
	document.write("Area of the "+this.type+" is : "+this.area);
}

Shape.prototype.calculateArea = function(){
}

function Square(){
	Shape.call(this,'square');
}
function Circle(){
	Shape.call(this,'circle');
}
Square.prototype = Object.create(Shape.prototype);
Circle.prototype = Object.create(Shape.prototype);

Square.prototype.calculateArea = function(){
	side = prompt("Enter the length of each side of the square\n");
	this.area = side * side;
}
Circle.prototype.calculateArea = function(){
	radius = prompt("Enter the radius of the circle\n");
	this.area = 3.14*radius*radius;
}

userChoice = prompt("Enter the shape : (circle or square)\n");

if(userChoice == 'square'){
	var square = new Square();
	square.calculateArea();
	square.display();
}
else if(userChoice == 'circle'){
	var circle = new Circle();
	circle.calculateArea();
	circle.display();
}
else{
	document.write("invalid choice\n");
}



