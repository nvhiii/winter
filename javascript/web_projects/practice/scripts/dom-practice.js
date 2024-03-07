const myDiv = document.querySelector(`#div1`);

const firstPara = document.createElement(`p`);
firstPara.style.color = `red`;
firstPara.textContent = `Hey I'm Red`;

myDiv.appendChild(firstPara);

const myH3 = document.createElement(`h3`);
myH3.style.color = `blue`;
myH3.textContent = `I'm a blue h3!`;
myDiv.appendChild(myH3);

const myDiv2 = document.createElement(`div`);
myDiv2.style.border = `black`;
myDiv2.style.backgroundColor = `pink`;

const myH1 = document.createElement(`h1`);
myH1.textContent = `I'm in a div!`;
myDiv2.appendChild(myH1);

const myP = document.createElement(`p`);
myP.textContent = `ME TOO!`;
myDiv2.appendChild(myP);

myDiv.appendChild(myDiv2);

// create const to hold button and the appropriate response via nodelist (can swap to array if needed)
const buttons = document.querySelectorAll("div1");

// buttons.forEach((button) => {
//   button.addEventListener("click", () => {
//     alert(`You pressed button ${button.id}`);
//   });
// });

const inputBar = document.querySelector("#item");
const inputButton = document.querySelector("button");
const outputList = document.querySelector("ul");

inputButton.addEventListener("click", () => {
  let val = inputBar.value;
  inputBar.value = ``;

  const li = document.createElement("li");
  const span = document.createElement("span");
  const itemButton = document.createElement("button");

  li.appendChild(span);
  li.appendChild(itemButton);

  span.textContent = val;
  itemButton.textContent = "Delete";

  outputList.appendChild(li);

  itemButton.addEventListener("click", () => {
    outputList.removeChild(li);
  });

  inputBar.focus();
});
