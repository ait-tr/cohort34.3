const handler = ({name, email, username}) => ({name, email, username});


// const result = fetch("https://jsonplaceholder.typicode.com/users");
// result.then(
//     (resp) => resp.json(),
//     (err) => console.log("Err: " + err)
// ).then(
//     (data)  => console.log(data.map(handler)),
//     (err) => console.log("Err: " + err)
// );

// async function request(){
//     const result = await fetch("https://jsonplaceholder.typicode.com/users");
//     const data = await result.json();
//     console.log(data.map(handler));
// }
// request();


// написать асинхронную функцию, которпя получает id todo элемента и выводит его в консоль


async function getTodo(id){
    const result = await fetch(`https://jsonplaceholder.typicode.com/todos/${id}`);
    const data = await result.json();
    console.log(data);
}
getTodo(15);