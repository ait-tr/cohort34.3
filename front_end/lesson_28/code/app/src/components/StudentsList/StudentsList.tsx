import { useState } from "react";
import { Student } from "../../types/Student"
import StudentItem from "../StudentItem/StudentItem"
import s from './style.module.css'

export default function StudentsList() {

  const defaultStudents: Student[] = [
    {firstName: "Анатолий", lastName: "Ушанов", marks: [5, 3, 4, 4]},
    {firstName: "Роман", lastName: "Иванов", marks: [4, 5, 4, 4, 5]},
    {firstName: "Юрий", lastName: "Митрофанов", marks: [4, 3, 3, 4]},
    {firstName: "Максим", lastName: "Грибов", marks: [4, 5, 5, 4, 5]}
  ];

  // создать state,  который хранит массив из студентов 
  // использовать его при отрисовке карточек студентов 
  // использовать массив students в качестве initialValue (начальное значение)
  
  const [students, setStudents] = useState<Student[]>(defaultStudents);
  
  return (
    <div className={s.students}>
        {
            students.map((student) => <StudentItem key={student.firstName} {...student} />)
        }
    </div>
  )
}