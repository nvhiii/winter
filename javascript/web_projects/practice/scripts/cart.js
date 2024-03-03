const unorderedList = document.createElement(`ul`);
document.body.appendChild(unorderedList);

const inputBar = document.querySelector(`input`); // finds first input tag and assigns var to this
const inputButton = document.querySelector(`button`); // finds first button tag and assigns var to this

function addItem() {

    const val = inputBar.value;
    inputBar.value = ``;

    const listItem = document.createElement(`li`);
    const spanItem = document.createElement(`span`);
    const buttonItem = document.createElement(`button`);

    // list item has text + button
    listItem.appendChild(spanItem);
    listItem.appendChild(buttonItem);

    spanItem.textContent = val;
    buttonItem.textContent = `Delete`;  

    unorderedList.appendChild(listItem);

    buttonItem.addEventListener(`click`, () => {

        unorderedList.removeChild(listItem);

    });

    inputBar.focus();

}

inputButton.addEventListener(`click`, addItem);

