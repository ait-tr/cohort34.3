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

// это пишем всегда, чтобы вывести тип хранилища автоматически
// тип хранилища будет браться из слайсов
export type RootState = ReturnType<typeof store.getState>;
export type RootDispatch = typeof store.dispatch;
