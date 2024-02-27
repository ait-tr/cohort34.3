import { createSlice } from "@reduxjs/toolkit";

type CounterType = {
    value:number
};

const initialState:CounterType = {
    value: 0
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
    }
})

export const { increment, decrement } = counterSlice.actions;
export default counterSlice.reducer;




