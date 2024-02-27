import React from "react";
import { useSelector } from "react-redux";
import { Store } from "../../store/store";

function Header() {
  // пишем useSelector, когда нужно получить данные из хранилища
  const productsCount = useSelector(
    // products - название слайса
    // productsCount - ключ внутри слайса
    (store: Store) => store.products.productsCount
  );

  return (
    <header style={{ backgroundColor: "rebeccapurple" }}>
      Магазин Классных Вещей{" "}
      <span style={{ color: "white" }}>Корзина: {productsCount} товаров</span>
    </header>
  );
}

export default Header;
