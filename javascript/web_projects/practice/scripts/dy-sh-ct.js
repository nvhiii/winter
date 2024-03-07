const input = document.querySelector(`input`);
const button = document.querySelector(`button`);
const itemList = document.querySelector(`ul`);

// add eventlistener
button.addEventListener(`click`, () => {
  let itemValue = input.value;
  input.value = ``;

  const li = document.createElement(`li`);
  const span = document.createElement(`span`);
  const removeBtn = document.createElement(`button`);

  span.textContent = itemValue;
  removeBtn.textContent = `Remove`;

  //   add the item content and remove button via append
  li.appendChild(span);
  li.appendChild(removeBtn);
  //   append the full item to the master item list
  itemList.appendChild(li);

  removeBtn.addEventListener(`click`, () => {
    itemList.removeChild(li);
  });

  // prep input bar for new input
  input.focus();
});
