Redux Toolkit предоставляет инструменты для упрощения управления состоянием в Redux-приложениях. Если вы используете TypeScript (TS) с Redux Toolkit, то вы, вероятно, хотели бы использовать "createAsyncThunk" для обработки сетевых запросов.

Вот пример того, как вы можете создать сетевой запрос с использованием Redux Toolkit и TypeScript:

1. Установите Redux Toolkit (если у вас его еще нет):
   ```bash
   npm install @reduxjs/toolkit react-redux
   ```

2. Создайте срез (slice) для управления состоянием и сетевым запросом:

   ```typescript
   // src/features/posts/postsSlice.ts
   import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
   import { RootState } from '../../app/store';

   // Тип для данных, которые возвращает ваш сетевой запрос
   interface Post {
     id: number;
     title: string;
     body: string;
   }

   // Создание асинхронного thunk для сетевого запроса
   export const fetchPosts = createAsyncThunk<Post[]>(
     'posts/fetchPosts',
     async () => {
       const response = await fetch('https://jsonplaceholder.typicode.com/posts');
       const data = await response.json();
       return data;
     }
   );

   // Создание среза для управления состоянием
   const postsSlice = createSlice({
     name: 'posts',
     initialState: [] as Post[],
     reducers: {},
     extraReducers: (builder) => {
       builder.addCase(fetchPosts.fulfilled, (state, action) => {
         // Обработка успешного завершения сетевого запроса
         return action.payload;
       });
     },
   });

   // Выборка данных из состояния
   export const selectPosts = (state: RootState) => state.posts;

   // Экспорт reducer и actions
   export default postsSlice.reducer;
   ```

3. В вашем основном файле Redux-стора подключите созданный срез:

   ```typescript
   // src/app/store.ts
   import { configureStore } from '@reduxjs/toolkit';
   import postsReducer from '../features/posts/postsSlice';

   const store = configureStore({
     reducer: {
       posts: postsReducer,
     },
   });

   export type RootState = ReturnType<typeof store.getState>;
   export type AppDispatch = typeof store.dispatch;

   export default store;
   ```

4. Используйте созданный thunk в вашем компоненте React:

   ```typescript
   // src/components/PostsList.tsx
   import React, { useEffect } from 'react';
   import { useDispatch, useSelector } from 'react-redux';
   import { fetchPosts, selectPosts } from '../features/posts/postsSlice';

   const PostsList: React.FC = () => {
     const dispatch = useDispatch();
     const posts = useSelector(selectPosts);

     useEffect(() => {
       // Вызов асинхронного thunk для сетевого запроса
       dispatch(fetchPosts());
     }, [dispatch]);

     return (
       <div>
         <h2>Posts</h2>
         <ul>
           {posts.map((post) => (
             <li key={post.id}>{post.title}</li>
           ))}
         </ul>
       </div>
     );
   };

   export default PostsList;
   ```

Теперь у вас есть пример использования Redux Toolkit и TypeScript для управления сетевыми запросами в Redux-приложении.