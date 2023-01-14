/**
 * 
 */
function makeNum(num, func) {
  if (func === undefined) {
		return num;
	} else {
		return func(num);
	}
}

function zero(func) {
	return makeNum(0,func);
}
function one(func) {
	return makeNum(1,func);
}
function two(func) {
	return makeNum(2,func);
}
function three(func) {
	return makeNum(3,func);
}
function four(func) {
	return makeNum(4,func);
}
function five(func) {
	return makeNum(5,func);
}
function six(func) {
	return makeNum(6,func);
}
function seven(func) {
	return makeNum(7,func);
}
function eight(func) {
	return makeNum(8,func);
}
function nine(func) {
	return makeNum(9,func);
}

function times(right) {
  return function(left) { return left * right; };
}
function plus(right) {
  return function(left) { return left + right; };
}
function minus(right) {
  return function(left) {
		return left - right;
	};
}
function dividedBy(right) {
  return function(left) { return left / right; };
}
seven(times(five())) // must return 35
four(plus(nine())) // must return 13
eight(minus(three())) // must return 5
six(divided_by(two())) // must return 3

console.log(one(plus(nine()))); // must return 13
