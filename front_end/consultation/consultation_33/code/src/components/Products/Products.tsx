import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { RootDispatch, RootState } from "../../store/store";
import { loadProducts } from "../../store/slices/productsSlice";

function Products() {
  // достаём продукты из хранилища
  const products = useSelector(
    // products - имя слайса
    // productsList - ключ, в котором лежит массив продуктов
    (state: RootState) => state.products.productsList
  );
  const status = useSelector((state: RootState) => state.products.status);

  // RootDispatch указываем, чтобы успокоить typescript
  const dispatch = useDispatch<RootDispatch>();

  return (
    <div className="products" style={{ backgroundColor: "goldenrod" }}>
      {status === "ready" ? (
        <button onClick={() => dispatch(loadProducts())}>Загрузить</button>
      ) : (
        <div>Загрузка...</div>
      )}
      {products.map((product) => (
        <div
          key={product.id}
          className="product"
          style={{ border: "1px solid black" }}
        >
          <div>{product.title}</div>
        </div>
      ))}
    </div>
  );
}

export default Products;
