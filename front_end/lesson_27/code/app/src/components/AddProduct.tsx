import React, { useState } from "react";

export default function AddProduct() {
  
  type FormDataType = {
    title:string,
    price:string,
    count:string
  };

  const [formData, setFormData] = useState<FormDataType>({title: "", price: "", count: ""});

  const changeHandler = (event:React.ChangeEvent<HTMLInputElement>):void => {
    const {value, name} = event.target;
    const newData:FormDataType = {...formData, [name]: value};
    setFormData(newData);
    console.log(formData);
  }


  const submitHandler = (event:React.FormEvent):void => {
    event.preventDefault();
  } 

  return (
    <div>
        <p>Форма для добавления продукта:</p>
        <form onSubmit={submitHandler}>
            <input value={formData.title} type="text" name="title" placeholder="title" onChange={changeHandler} />
            <input value={formData.price} type="text" name="price" placeholder="price" onChange={changeHandler} />
            <input value={formData.count} type="text" name="count" placeholder="count" onChange={changeHandler} />
            <button>Добавить</button>
        </form>
    </div>
  )
}