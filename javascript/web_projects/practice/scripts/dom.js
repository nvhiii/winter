const container = document.querySelector('#container');

const redPara = document.createElement('p');
redPara.style.color = 'red';
redPara.textContent = "Hey I'm Red!";

container.appendChild(redPara);

const blueH3 = document.createElement('h3');
blueH3.style.color = 'blue';
blueH3.textContent = `I'm a blue H3!`;

container.appendChild(blueH3);

const newDiv = document.createElement(`div`);
newDiv.style.border = `black`;
newDiv.style.backgroundColor = `pink`;

const newH1 = document.createElement(`h1`);
newH1.textContent = `I'm in a div`;
newDiv.appendChild(newH1);

const newP = document.createElement(`p`);
newP.textContent = `ME TOO!`;
newDiv.appendChild(newP);

container.appendChild(newDiv);
