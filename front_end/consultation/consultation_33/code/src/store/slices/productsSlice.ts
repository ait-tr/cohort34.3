// ячейка (слайс) с данными о продуктах
import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { Product } from "../../types/Product";

const initialState: {
  productsList: Product[];
  status: "ready" | "loading";
} = {
  productsList: [],
  // статус загрузки продуктов (загружено / загружается)
  status: "ready",
};

// Если нужно добавить какое-то действие, которое может совершить пользователь тогда:
// Если действие приводит к запросу на сервер - добавляем asyncThunk и extraReducer
//    asyncThunk - как мы получаем данные с сервера
//    extraReducer - как мы меняем хранилище после получения данных
// Если действие не приводит к запросу на сервер - добавляем reducer

export const loadProducts = createAsyncThunk(
  // тут всегда название-слайса/название-действия
  "products/loadProducts",
  async () => {
    const result = await fetch("http://127.0.0.1:5500/server/products.json");
    const data = await result.json();

    // подождать 3 секунды
    // притворяемся как будто бы сервер отвечает нам не моментально
    await new Promise((resolve) => setTimeout(resolve, 3000));

    return data; // то что возвращаем из санка уйдёт в payload в extraReducers
  }
);

const productsSlice = createSlice({
  // имя слайса то же самое, что мы написали в файле store.ts
  name: "products",
  // начальное состояние - объект с начальными данными слайса
  initialState,
  reducers: {},
  extraReducers(builder) {
    builder
      // loadProducts.fulfilled - что сделать с хранилищем когда продукты успешно загружены
      .addCase(loadProducts.fulfilled, (state, { payload }) => {
        state.productsList = payload;
        // меняем статус на "загружено"
        state.status = "ready";
      })
      // loadProducts.pending - что сделать с хранилищем когда мы начали загружать продукты
      .addCase(loadProducts.pending, (state) => {
        // меняем статус на "загружается"
        state.status = "loading";
      });
  },
});

// всегда делается такой экспорт
export default productsSlice.reducer;
