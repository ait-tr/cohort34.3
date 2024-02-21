import { useDispatch, useSelector } from "react-redux"
import { RootDispatch, Store } from "../store/store";
import { decrement, increment, incrementAsync } from "../store/slices/counterSlice";

export default function Counter() {

  const count: {status:string, value:number} = useSelector((store:Store) => store.counter);
  const dispatch = useDispatch<RootDispatch>();

  console.log(count);

  return (
    <div>
        <p>{count.value}</p>
        <button onClick={() => dispatch(increment(1))}>+</button>
        <button onClick={() => dispatch(decrement(1))}>-</button>
        <button onClick={() => dispatch(incrementAsync())}>
          {count.status === "loading" ? "loading...": "+++"}
        </button>
    </div>
  )
}