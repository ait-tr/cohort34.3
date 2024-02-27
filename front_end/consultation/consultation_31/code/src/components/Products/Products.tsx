import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { Store } from "../../store/store";
import { decrement, increment } from "../../store/slices/productsSlice";

function Products() {
  // пишем useSelector, когда нужно получить данные из хранилища
  const productsCount = useSelector(
    // products - название слайса
    // productsCount - ключ внутри слайса
    (store: Store) => store.products.productsCount
  );

  // использвем useDispatch для изменения данных в хранилище
  // для изменения данных:
  // 1. получаем функцию dispatch
  const dispatch = useDispatch();

  const decreaseProductsCount = () => {
    if (productsCount > 0) {
      // 2. импортируем действия из слайса
      // import { decrement, increment } from "../../store/slices/productsSlice";
      // 3. вызваем функцию dispatch с результатом этого действия
      dispatch(decrement());
    }
  };

  const increaseProductsCount = () => {
    dispatch(increment());
  };

  return (
    <div className="products" style={{ backgroundColor: "goldenrod" }}>
      <div className="product">
        <div>Чайник</div>
        <div>
          <button onClick={decreaseProductsCount}>-</button> {productsCount}{" "}
          <button onClick={increaseProductsCount}>+</button>
        </div>
      </div>
    </div>
  );
}

export default Products;
