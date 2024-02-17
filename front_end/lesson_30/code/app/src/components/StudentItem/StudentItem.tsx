import { Student } from "../../types/Student";
import s from "./style.module.css";

type Props = Student & {removeStudent:Function, addMark:Function, clearMarks:Function};

export default function StudentItem({firstName, lastName, marks, removeStudent, addMark, clearMarks}: Props) {
  const avgMark = marks.reduce((acc, item) => acc + item, 0) / marks.length;
  
  return (
    <div className={s.item}>
        <p>Имя: {firstName}</p>
        <p>Фамилия: {lastName}</p>
        <p>Средняя оценка: {avgMark.toFixed(2)}</p>
        <button onClick={() => removeStudent(lastName)}>Удалить</button>
        <button onClick={() => addMark(lastName, 1)}>1</button>
        <button onClick={() => addMark(lastName, 5)}>5</button>
        <button onClick={() => clearMarks(lastName)}>clear</button>
    </div>
  )
}

// 1) Добавить кнопку "1"
// 2) доработать addMark таким образом, чтобы помимо фамилии он получал оценку, которую нужно добавить
// 3) привязать обработчик addMark к кнопке "1"