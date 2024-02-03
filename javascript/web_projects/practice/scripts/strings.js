// string practice
let string1 = "Strings can be enclosed w/ double quotes";
let string2 = "Strings can also be enclosed w/ single quotes";

let string3 = "In order to show newlines in these enclosures, \nyou must use newline character";
let string4 = `Strings enclosed w backticks can do this w/ ease.
               See!`;

// button functionality
const button = document.querySelector("button");

function greet() {

    const name = prompt("Hello, what is your name?");
    const greeting = document.querySelector(".greeting");
    greeting.textContent = `Hello, how are you doing today ${name}`;

}

button.addEventListener("click", greet);
