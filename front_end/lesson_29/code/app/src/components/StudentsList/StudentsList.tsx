import { useState } from "react";
import { Student } from "../../types/Student"
import StudentItem from "../StudentItem/StudentItem"
import s from './style.module.css'

type Props = {
  students: Student[],
  removeStudent:Function, 
  addMark:Function, 
  clearMarks:Function
};

export default function StudentsList({students, removeStudent, addMark, clearMarks}:Props) {

  const handlers = {removeStudent, addMark, clearMarks};
  return (
    <div className={s.students}>
        {
            students.map((student) => <StudentItem 
              key={student.firstName} 
              {...student} 
              {...handlers}
            />)
        }
    </div>
  )
}