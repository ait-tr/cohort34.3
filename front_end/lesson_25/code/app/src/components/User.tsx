type Props = {
    name:string,
    lastName:string,
    age:number,
    showAge:boolean
};

function User({name, lastName, age, showAge}:Props){
    return (
        <div>
            <p>Имя: {name}</p>
            <p>Фамилия: {lastName}</p>
            {
                showAge
                ? <p>Возраст: {age}</p>
                : ""
            }
        </div>
    );
}

export default User;