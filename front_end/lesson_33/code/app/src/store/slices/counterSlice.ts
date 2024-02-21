import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";

// loading - загрузка
// ready - все окей
// error - ошибка

type CounterType = {
    status:string,
    value:number
};

const initialState:CounterType = {
    value: 0,
    status: "ready"
};

const counterSlice = createSlice({
    name: "counter",
    initialState, 
    reducers:{
        increment: (state, action)=> {
            state.value += 1;
        },
        decrement: (state, action)=> {
            state.value -= 1;
        }
    },
    extraReducers: (builder) => {
        builder
            .addCase(incrementAsync.fulfilled, (state, {payload}) => {
                state.value += payload;
                state.status = "ready";
            })
            .addCase(incrementAsync.pending, (state) => {
                state.status = "loading";
            })
            .addCase(incrementAsync.rejected, (state) => {
                state.status = "error";
            })
    }
})

// incrementAsync.pending - этап загрузки
// incrementAsync.fulfilled - положительный исход
// incrementAsync.rejected - неготивный исход

// loading - загрузка
// ready - все окей
// error - ошибка

export const incrementAsync = createAsyncThunk(
    "counter/incrementAsync",
    async () => {
        const resp = await fetch("https://dummyjson.com/products/1?delay=5000");
        const data = await resp.json();
        return 1;
    }
)


export const { increment, decrement } = counterSlice.actions;
export default counterSlice.reducer;
 




