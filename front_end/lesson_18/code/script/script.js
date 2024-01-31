const containerNode = document.querySelector(".img_container");

// containerNode.addEventListener("click", () => {
//     // проверка на анличие класса "clicked"
//     if (containerNode.classList.contains("clicked")){
//         // если он есть, мы его удаляем
//         containerNode.classList.remove("clicked");
//     }else{
//         // если его нет, мы его добавляем
//         containerNode.classList.add("clicked");
//     }
// })

containerNode.addEventListener("click", () => {
    // проверка на анличие класса "clicked"
    // если он есть, мы его удаляем
    // если его нет, мы его добавляем
    containerNode.classList.toggle("clicked");
})


// получение NodeList из картинок (по селектору)
const imagesNodeList = document.querySelectorAll(".small_cards img");
// синтаксис преобразования итерируемого объекта в массив
// [...imagesNodeList]
imagesNodeList.forEach(imgNode => {
    // на каждую картинку повесить обработчик клика
    // при клике на картинку в консоль должно выводиться сообщение "click!"
    imgNode.addEventListener("click", event => {
        // добавить процесс вывода ссылки на картинку (значение атрибута src)
        // в консоль
        // console.log(event.target.src);

        const bigCardNode = document.querySelector(".big_card");
        bigCardNode.src = event.target.src;

        // процесс удаления класса selected у всех элементов
        imagesNodeList.forEach(elem => elem.classList.remove("selected"));

        // добавление класса selected на нажатую картинку
        event.target.classList.add("selected");

        // добавить процесс присвоения ссылки на картинку (по которой мы нажали)
        // в качестве атрибута  src для .big_card
    })
})