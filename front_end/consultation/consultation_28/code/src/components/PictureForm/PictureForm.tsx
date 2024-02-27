import React from "react";

function PictureForm() {
  return (
    <form id="form">
      <input name="name" placeholder="Имя художника" />
      <input name="nameOfPic" placeholder="Название картины" />
      <input name="link" placeholder="Ссылка на изображение" />
      <button>Добавить</button>
    </form>
  );
}

export default PictureForm;
