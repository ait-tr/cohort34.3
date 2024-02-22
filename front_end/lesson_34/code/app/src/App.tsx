import { useEffect } from "react";
import UsersList from "./components/UsersList/UsersList";
import { useDispatch } from "react-redux";
import { RootDispatch } from "./store/store";
import { loadUsers } from "./store/slices/usersSlice";

function App() {

  const dispatch = useDispatch<RootDispatch>();
  useEffect(() => {
    dispatch(loadUsers());
  }, []);

  return (
    <div>
     <UsersList />
    </div>
  );
}

export default App;
