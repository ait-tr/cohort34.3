import React, { useState } from "react";

export default function Clicker() {

  const [state, setState] = useState<number>(10);

  const handlerRight = (event:React.MouseEvent):void => {
    event.preventDefault();
    setState(state + 1);
  }

  const handlerLeft = ():void => {
    setState(state - 1);
  }

  return (
    <div>
        <p>{state}</p>
        <button onClick={() => setState(state + 1)}>+</button>
        <button onClick={() => setState(state === 0? state:state - 1)}>-</button>
        <button onClick={handlerLeft} onContextMenu={handlerRight}>+/-</button>
    </div>
  )
}

// заменить вывод сообщений на изменение состояния