function selectionSort(array) {
  // change code below this line
  var n = array.length;
  for (var i = 0; i < n - 1; i++) {
    for (var j = 0; j < n - 1; j++) {
      if (array[j] > array[j + 1]) {
        var tmp;
        tmp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = tmp;
      }
    }
  }
  // change code above this line\n  return array;\n}\n\n// test array:\n// [1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]"}
  // change code above this line
  return array;
}

// test array:
// [1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]
