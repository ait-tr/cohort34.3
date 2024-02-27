import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import { Provider } from "react-redux";
// импортируем хранилище (store)
import { store } from "./store/store";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    {/* Подключем store к дереву React-компонентов */}
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);
