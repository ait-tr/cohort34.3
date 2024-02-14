import React, { useState } from "react";
import PictureItem from "../PictureItem/PictureItem";

// Родительский компонент
function PicturesList() {
  const [pictures, setPictures] = useState([
    {
      title: "Звёздная ночь",
      author: "Ван Гог",
      url: "https://www.hse.ru/data/2017/05/17/1171369516/zvezdnoe_nebo.jpeg",
    },
    {
      title: "Сад земных наслаждений",
      author: "Босх",
      url: "https://upload.wikimedia.org/wikipedia/commons/a/ae/El_jard%C3%ADn_de_las_Delicias%2C_de_El_Bosco.jpg",
    },
    {
      title: "Крик",
      author: "Эдвард Мунк",
      url: "https://anderzeit.ru/wp-content/uploads/2023/01/scale_1200-2-1.jpg",
    },
  ]);

  const removePicture = (title: string) => {
    // удаляем из массива элемент с переданным title с помощью метода filter
    const newPictures = pictures.filter((picture) => picture.title !== title);
    // изменяем старый массив на новый без удалённого элемента
    setPictures(newPictures);
  };

  return (
    <div id="picturesContainer">
      {/* чтобы на основе массива отобразить на странице компоненты применяем map */}
      {pictures.map(({ author, title, url }) => (
        <PictureItem
          key={title}
          // это пропсы - параметры, которые мы передаём в дочерний компонент
          // передаём значения пропсов в кавычках если это конкретная известная строка
          // title="Ван Гог"
          // если значение свойства находится в переменной тогда передаём эту переменную в фигурных скобках
          title={title}
          author={author}
          url={url}
          // при нажатии на кнопку "удалить" вызовется функция removePicture
          onRemove={removePicture}
        />
      ))}
    </div>
  );
}

export default PicturesList;
