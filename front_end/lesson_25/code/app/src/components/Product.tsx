type Props = {
    title:string,
    price:number,
    count:number
};

function Product(props:Props){

    return (
        <div>
            <p>Название: {props.title}</p>
            <p>Цена: {props.price}</p>
            {
                props.count === 0
                ? <p>Товар кончился</p>
                : <p>Кол-во: {props.count}</p>
            }
        </div>
    );
}

export default Product;