function rangeOfNumbers(startNum, endNum) {
  if (endNum - startNum === 0) {
    return [startNum];
  } else {
    var myArray = rangeOfNumbers(startNum, endNum - 1);
    myArray.push(endNum);
    return myArray;
  }
};

var i = rangeOfNumbers(1, 10);
console.log(i);