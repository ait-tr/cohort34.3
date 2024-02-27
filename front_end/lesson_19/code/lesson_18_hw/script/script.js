const images = [
    "/media/img.jpeg", 
    "/media/img_2.jpeg", 
    "/media/img_3.jpeg", 
    "/media/img_3.webp"
];

let imgIndex = 0;

const leftBtnNode = document.querySelector(".triggers .left");
const rightBtnNode = document.querySelector(".triggers .right");

leftBtnNode.addEventListener("click", () =>{
    const mainImgNode = document.querySelector(".main_img");
    mainImgNode.src = images[Math.abs(--imgIndex % images.length)];
})

rightBtnNode.addEventListener("click", () =>{
    const mainImgNode = document.querySelector(".main_img");
    mainImgNode.src = images[Math.abs(++imgIndex % images.length)];
})

const mainImgNode = document.querySelector(".main_img");
mainImgNode.src = images[0];