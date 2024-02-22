import { useSelector } from 'react-redux'
import { RootState } from '../../store/store'
import UserItem from '../UserItem/UserItem';

export default function UsersList() {

  const {value, status} = useSelector((state: RootState) => state.users);

  return (
    <div>
        {
            value.map(user => <UserItem key={user.id} {...user} />)
        }
    </div>
  )
}