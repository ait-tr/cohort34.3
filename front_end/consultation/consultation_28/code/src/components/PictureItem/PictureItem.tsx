import React from "react";

type PictureItemProps = {
  title: string;
  author: string;
  url: string;
  // onRemove - это функция, это наше собственное событие для компонента PictureItem
  // onRemove - это фукнция, которая принимает строку titile и ничего не возвращает
  // с помощью этого события дочерний компонент "Картина" уведомит компонент "Список картин" о том что нажата кнопка "Удалить" и нужно удалять элемент из массива
  onRemove: (title: string) => void;
};

// дочерний компонент
function PictureItem({ author, title, url, onRemove }: PictureItemProps) {
  return (
    <article className="picture-card">
      <header>{title}</header>
      {/* в JSX необходимо закрывать все теги */}
      <img style={{ height: 200 }} src={url} />
      <footer>
        {/* когда пользователь кликает на кнопку вызываем событие-функцию onRemove */}
        {/* таким образом мы уведомим родительский компонент о том что нужно удалить картину */}
        <button onClick={() => onRemove(title)}>Удалить</button> {author}
      </footer>
    </article>
  );
}

export default PictureItem;
