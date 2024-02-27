// здесь мы перечисляем все слайсы (ячейки), которые будут в хранилище
import { configureStore } from "@reduxjs/toolkit";
// тут пойдёт список слайсов
import productsSlice from "./slices/productsSlice";

export const store = configureStore({
  reducer: {
    // в этом объекте мы будем перечислять все слайсы (ячейки)
    // ключи здесь - это названия этих ячеек
    // products - название ячейки
    products: productsSlice,
  },
});

// объявляем тип хранилища (те данные, которые в нём хранятся)
export type Store = {
  // показываем какие данные будут лежать в ячейке products
  products: {
    productsCount: number;
  };
};
