import Product from "./components/Product";
import User from "./components/User";


function App() {
  return (
    <div>
        Hello world
        <User name={"Гайк"} lastName={"Инанц"} age={32} showAge={true} />
        <User name={"Анатолий"} lastName={"Ушанов"} age={31} showAge={false}/>
        <Product title={"велосипед"} price={2300} count={12}/>
        <Product title={"велосипед"} price={2300} count={0}/>
    </div>
  );
}

export default App;

// добавить в User prop с название showAge
// если он true, то вывести возраст пользователя
// в ином случае не выводить его