// this line assigns a variable to the button type
const button = document.querySelector("button");

// function called greet
function greet() {

    const name = prompt("What is your name?");
    
    // greeting will be referring to a div, so need to assign to div with class greeting
    const greeting = document.querySelector(".greeting");

    // add text content to div
    greeting.textContent = `Hello ${name}, welcome to js testing!`;

}

button.addEventListener("click", greet);

// function for string testing
function stringTest() {

    const test = prompt("Please enter any string value.");
    const output = document.querySelector(".string");
    const charAtFifth = test.charAt(5);
    const slicedTest = test.slice(7);
    // added forward slashes to organize output
    output.textContent = `This is a test string: \'${test}\' and its length is ${test.length}. The char at index 5 is: ${charAtFifth}. Here is the sliced string: ${slicedTest}`;

    // slice = .slice(start, end) -> end is exclusive, can use negative indexes
    // substring = .substring(start, end) -> same as slice, but negative index turns into auto 0
    
}

button.addEventListener("click", stringTest);
