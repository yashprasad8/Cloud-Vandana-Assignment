const prompt = require ("prompt-sync")();

function descendingSort(a, b) {
    return b - a;
  }
  

  const input = prompt("Enter numbers separated by spaces:");
  const inputArray = input.split(' ').map(Number
  );
  
  if (inputArray.some(isNaN)) {
    console.log("Invalid input. Please enter numbers separated by spaces.");
  } else {
    inputArray.sort(descendingSort);
  
    console.log("Sorted Array (Descending Order): " + inputArray.join(', '));
  }
  
