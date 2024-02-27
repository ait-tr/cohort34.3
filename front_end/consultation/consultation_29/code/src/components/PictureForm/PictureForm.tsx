import React from "react";
import s from "./styles.module.css";

console.log(s);

function PictureForm() {
  return (
    // было className="component"
    <form className={s.component}>
      <input name="name" placeholder="Имя художника" />
      <input name="nameOfPic" placeholder="Название картины" />
      <input name="link" placeholder="Ссылка на изображение" />
      <button>Добавить</button>
    </form>
  );
}

export default PictureForm;
