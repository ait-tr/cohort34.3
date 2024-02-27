import {ChangeEvent, useState } from "react"


export default function InputText() {

  const [state, setState] = useState<string>("");

  const changeHandler = (event:ChangeEvent<HTMLInputElement>) => {
    setState(event.target.value);
  }

  return (
    <div>
        <input value={state} onChange={changeHandler} type="text" />
        <p>{state}</p>
    </div>
  )
}