const button = document.querySelector("button");

// function declaration
function add7(num) {

    return num + 7;

}

function multiply(num1, num2) {

    return num1 * num2;

}

function capitalize() {

    let userString = prompt("Enter any string.");
    let capitalizedOutput = document.querySelector(".caps");


    let firstChar = userString.charAt(0);
    let restOfString = userString.slice(1); // returns 2nd char to end of string

    // concat
    capitalizedOutput.textContent = `${firstChar.toUpperCase()}${restOfString.toLowerCase()}`;

}

function lastLetter() {

    let str = prompt("enter your favorite string.");
    let lastOutput = document.querySelector(".last-letter");

    lastOutput.textContent = `${str.charAt(str.length-1)}`;

}

button.addEventListener("click", lastLetter);

// need to remember that param selection is very unique imo, i think needs review