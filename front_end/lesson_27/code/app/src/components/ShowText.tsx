import { useState } from "react";

export default function ShowText() {
  
  const [show, setShow] = useState<boolean>(true);
  
  return (
    <div>
        <button onClick={() => setShow(!show)}>
            {show ? "скрыть" :  "показать"}
        </button>
        {
            // show ? <p>Lorem ipsum dolor sit amet.</p> : ""
            show && <p>Lorem ipsum dolor sit amet.</p> 
        }
    </div>
  )
}