import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { User } from "../../types/User";

// id:number,
// firstName:string,
// lastName:string,
// username:string,
// image:string,
// phone:string,
// age:number

const initialState: {value:User[], status:string} = {
    value: [],
    status: "loading"
};


const usersSlice = createSlice({
    name: "user",
    initialState,
    reducers: {},
    extraReducers(builder) {
        builder
            .addCase(loadUsers.pending, () => {})            
            .addCase(loadUsers.fulfilled, (state, {payload}) => {
                state.value.push(...payload.users);
            })
            .addCase(loadUsers.rejected, () => {})
    }
});

export const loadUsers = createAsyncThunk(
    "user/loadUsers",
    async () => {
        const resp = await fetch("https://dummyjson.com/users");
        const data = await resp.json()
        return data;
    }
)


export default usersSlice.reducer;

