import { Student } from "../../types/Student";
import s from "./style.module.css";

export default function StudentItem({firstName, lastName, marks}: Student) {
  const avgMark = marks.reduce((acc, item) => acc + item) / marks.length;
  
  return (
    <div className={s.item}>
        <p>Имя: {firstName}</p>
        <p>Фамилия: {lastName}</p>
        <p>Средняя оценка: {avgMark}</p>
        <button onClick={() => console.log(lastName)}>Удалить</button>
    </div>
  )
}

// при нажатии на кнопку "удалить" в консоль должна выводиться фамилия студента
