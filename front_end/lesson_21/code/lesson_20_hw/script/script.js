const btnNode = document.querySelector(".btn");
const messages = [
    "Изначальный текст", 
    "Привет, мир!", 
    "еще одно сообщение"
];
let index = 0;

btnNode.addEventListener("click", () => {
    const targetNode = document.querySelector(".target");
    targetNode.innerText = messages[index % messages.length];
    index++;
})

const messageFormNode = document.querySelector("#message_form");

messageFormNode.addEventListener("submit", event => {
    event.preventDefault();
    const message = event.target.message.value;
    console.log(message);
    event.target.reset();
})

const randomBtnNode = document.querySelector(".random_btn");

randomBtnNode.addEventListener("click", event => {
    const value = Math.round(Math.random() * 10 + 5);
    event.target.innerText = value;
})

// randomBtnNode.addEventListener("click", event => {
//     console.log("привет");
// })

// randomBtnNode.onclick = function(event){
//     const value = Math.round(Math.random() * 10 + 5);
//     event.target.innerText = value;
// }