import { configureStore } from "@reduxjs/toolkit";
import usersReducer from "./slices/usersSlice";

export const store = configureStore({
    reducer: {
        users: usersReducer
    }
});

export type RootState = ReturnType<typeof store.getState>;
export type RootDispatch = typeof store.dispatch;
