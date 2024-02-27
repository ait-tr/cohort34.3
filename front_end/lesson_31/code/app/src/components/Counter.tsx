import { useDispatch, useSelector } from "react-redux"
import { Store } from "../store/store";
import { decrement, increment } from "../store/slices/counterSlice";

export default function Counter() {

  const count:number = useSelector((store:Store) => store.counter.value);
  const dispatch = useDispatch();
  return (
    <div>
        <p>{count}</p>
        <button onClick={() => dispatch(increment(1))}>+</button>
        <button onClick={() => dispatch(decrement(1))}>-</button>
    </div>
  )
}