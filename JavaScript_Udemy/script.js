//Lecture: Variables
/*
var name = 'Shubham';
console.log(name);

var lastname = 'Rawat';
console.log(lastname);

var age = 22;
console.log(age);

var fullage = true;
console.log(fullage);
*/

//Lecture: Variables 2
/*
var name = 'Shubham';
var age = 22;

console.log(name+' '+age);
console.log(age + age);

var job, isMarried;
console.log(job);

job = 'Engineer';
isMarried = false;

console.log(name + ' is ' + age + ' years old ' + job +
 '. Is he married? ' + isMarried );

 var lastname = prompt('What is the last name?');
 console.log(lastname);

 alert(name + ' is ' + age + ' years old ' + job +
 '. Is he married? ' + isMarried );
*/

//Lecture: Operators
/*
var birthyear = 2016 - 26;
birthyear -= 10;
console.log(birthyear);

var a,b;
a = b = 26+4;
a += 6;
console.log(a);
console.log(b);
*/

//Lecture : If/Else statements
/*
var name = 'Shubham';
var age = 22;
var isMarried = 'no';

if(isMarried === 'yes'){
	console.log(name + ' is married.');
}
else{
	console.log(name + ' will hopefully marry soon.');
}
// third equal sign for no type coercion
*/

//Lecture: Boolean Logic and Switch
/*
var job = 'abc';

switch(job){
	case 'a':
		console.log('Shubham : a');
		break;
	case 'abc':
		console.log('Shubham : abc');
		break;
	default:
		console.log('Shubham : unknown');
}
*/

//Lecture: Functions
/*
function calcAge(yearOfBirth){
	var age = 2017 - yearOfBirth;
	return age;
}

function calcsum(a,b = 8){
	return a+b;
}

var age = calcAge(1995);
console.log(age);

var sum = calcsum(2);
console.log(sum);
*/

//Lecture Arrays
/*
var names = ['Shubham', 'John', 'Mark']
var years = new Array(1990,1969,1948);

console.log(names[0]);
names[0] = 'Ben';
console.log(names[0]);

var shubham = ['Shubham','Rawat',1995,'Engineer',false];
shubham.push('blue');
shubham.unshift('Mr.');
shubham.pop(); //removes from end
shubham.shift(); //removes from beginning

console.log(shubham);

alert(shubham.indexOf('Rawat'));
*/

//Lecture: Objects
/*
var shubham = {
	name: 'Shubham',
	lastname: 'Rawat',
	age: 22,
};

console.log(shubham.lastname);
console.log(shubham);
console.log(shubham['lastname']);
*/

//Lecture: Loops

for(var i=0;i<10;++i){
	console.log(i);
}
