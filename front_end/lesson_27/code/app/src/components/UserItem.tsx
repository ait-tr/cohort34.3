import { User } from "../types/User";


export default function UserItem({firstName, lastName, age}: User) {
  return (
    <div>
        <p>{firstName}</p>
        <p>{lastName}</p>
        <p>{age}</p>
    </div>
  )
}