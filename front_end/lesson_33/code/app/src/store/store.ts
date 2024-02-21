import { configureStore } from "@reduxjs/toolkit";
import counterReducer from "./slices/counterSlice";

export const store = configureStore({
    reducer: {
        counter: counterReducer
    }
});

export type Store = {
    counter: {
      value:number,
      status:string
    }
}

export type RootDispatch = typeof store.dispatch;