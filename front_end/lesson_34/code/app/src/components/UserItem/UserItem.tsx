import { User } from "../../types/User";

export default function UserItem({id, firstName, lastName}: User) {
  return (
    <div>
        <p>Имя: {firstName}</p>
        <p>Фамилия: {lastName}</p>
    </div>
  )
}