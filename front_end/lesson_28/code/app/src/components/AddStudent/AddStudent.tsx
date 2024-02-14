import React, { ChangeEvent, useState } from 'react'
import s from './style.module.css'

type FormData = {
    firstName:string,
    lastName:string
};

export default function AddStudent() {
  const [student, setStudent] = useState<FormData>({firstName: "", lastName: ""})

  const changeHandler = (event:ChangeEvent<HTMLInputElement>) => {
    const {name, value} = event.target;
    setStudent({
        ...student,
        [name]: value
    });
  }

  return (
    <form className={s.form}>
        <input value={student.firstName} type="text" name='firstName' onChange={changeHandler}/>
        <input value={student.lastName} type="text" name='lastName' onChange={changeHandler}/>
        <button>Добавить</button>
    </form>
  )
}