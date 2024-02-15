import { useState } from "react";
import AddStudent from "./components/AddStudent/AddStudent";
import StudentsList from "./components/StudentsList/StudentsList";
import "./style.css";
import { Student } from "./types/Student";

function App() {

  const defaultStudents: Student[] = [
    {firstName: "Анатолий", lastName: "Ушанов", marks: [5, 3, 4, 4]},
    {firstName: "Роман", lastName: "Иванов", marks: [4, 5, 4, 4, 5]},
    {firstName: "Юрий", lastName: "Митрофанов", marks: [4, 3, 3, 4]},
    {firstName: "Максим", lastName: "Грибов", marks: []}
  ];
  
  const [students, setStudents] = useState<Student[]>(defaultStudents);
  
  const removeStudent = (value:string):void => setStudents(students.filter(({lastName}) => lastName !== value));

  const addMark = (value:string, mark:number):void => {
    const target:Student | undefined = students.find(({lastName}) => lastName === value);
    target && target.marks.push(mark);
    setStudents([...students]);
  }

  const clearMarks = (value:string):void => {
    const target:Student | undefined = students.find(({lastName}) => lastName === value);
    target && (target.marks = []);
    setStudents([...students]);
  }
  const handlers = {removeStudent, addMark, clearMarks};

  return (
    <div >
      <AddStudent />
      <StudentsList students={students} {...handlers}/>
    </div>
  );
}

export default App;
