import React, { ChangeEvent, FormEvent, useState } from 'react'
import s from './style.module.css'
import { Student } from '../../types/Student';

type FormData = {
    firstName:string,
    lastName:string
};

type Props = {addStudent:Function};

export default function AddStudent({addStudent}:Props) {
  const [student, setStudent] = useState<FormData>({firstName: "", lastName: ""})

  const changeHandler = (event:ChangeEvent<HTMLInputElement>) => {
    const {name, value} = event.target;
    setStudent({
        ...student,
        [name]: value
    });
  }

  const formHandler = (event:FormEvent) => {
    event.preventDefault();
    const newStudent:Student = {...student, marks:[]};
    addStudent(newStudent);
  }

  return (
    <form onSubmit={formHandler} className={s.form}>
        <input value={student.firstName} type="text" name='firstName' onChange={changeHandler}/>
        <input value={student.lastName} type="text" name='lastName' onChange={changeHandler}/>
        <button>Добавить</button>
    </form>
  )
}