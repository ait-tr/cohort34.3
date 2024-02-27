import React, { useState } from "react";

export default function Clicker() {

  const [state, setState] = useState<number>(0);
  const [step, setStep] = useState<number>(1);

  return (
    <div>
      <div>
          <p>{state}</p>
          <button onClick={() => setState(state + step)}>+</button>
          <button onClick={() => setState(state < step? state:state - step)}>-</button>
          <button onClick={() => setState(0)}>reset</button>
          <button onClick={() => setState(state * step)}>X {step}</button>
      </div>
      <div>
        <h2>Изменение шага:</h2>
        <p>{step}</p>
        <button onClick={() => setStep(step + 1)}>+</button>
        <button onClick={() => setStep(step === 0? step:step - 1)}>-</button>
      </div>
    </div>
  )
}