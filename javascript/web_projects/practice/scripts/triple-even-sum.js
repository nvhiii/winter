const containerOne = document.querySelector(`.container-one`);

// Take in an array.
// For every even number, it will triple it.
// Then it will sum all those even numbers.

function sumOfTripledEvens(array) {
  //   let sum = 0;
  //    for (let num of array) {
  //      if (num % 2 === 0) {
  //        let tripledNum = 3 * num;
  //        sum += tripledNum;
  //      }
  //    }
  //    return sum;
  //
  return array
    .filter((num) => num % 2 === 0)
    .map((num) => num * 3)
    .reduce((acc, curr) => (acc += curr));

  // interesting way to write this
}

num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const pInContainerOne = document.createElement(`p`);
pInContainerOne.textContent = `Appling sumOfTripled fxn to the array: ${num}
                                yields: ${sumOfTripledEvens(num)}`;

containerOne.appendChild(pInContainerOne);
