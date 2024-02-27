import React, { useState } from "react";
import PictureForm from "./components/PictureForm/PictureForm";
import PicturesList from "./components/PicturesList/PicturesList";

function App() {
  return (
    <div>
      <h1>Галерея</h1>

      <PictureForm />

      <PicturesList />
    </div>
  );
}

export default App;
