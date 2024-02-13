import React, { ChangeEvent, FormEvent, FormEventHandler, useState } from 'react'

export default function AddUser() {

  type UserData = {
    firstName:string,
    lastName:string,
    age:string
  };

  const [formData, setFormData] = useState<UserData>({firstName: "", lastName: "", age: ""});

  const changeHandler = (event:ChangeEvent<HTMLInputElement>):void => {
    const {value, name} = event.target;
    // console.log(`value: ${value} name: ${name}`);
    const newData:UserData = {...formData, [name]: value};
    setFormData(newData);
    // console.log(newData);
  }

  const submitHandler:FormEventHandler = (e:FormEvent):void => {
    e.preventDefault();
    console.log(formData);
  }

  return (
    <div>
        <p>Форма добавления пользователя</p>
        <form onSubmit={submitHandler}>
            <input value={formData.firstName} type="text" name='firstName' placeholder='firstName' onChange={changeHandler}/>
            <input value={formData.lastName} type="text" name='lastName' placeholder='lastName' onChange={changeHandler}/>
            <input value={formData.age} type="text" name='age' placeholder='age' onChange={changeHandler}/>
            <button>Добавить</button>
        </form>
    </div>
  )
}