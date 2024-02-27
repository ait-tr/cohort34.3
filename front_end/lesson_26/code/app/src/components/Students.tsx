
type Props = {
    name:string,
    lastname:string,
    marks:number[]
}

export default function Students({name, lastname, marks}: Props) {
  const avgMark:number = marks.reduce((acc, item) => acc + item) / marks.length;
  const avgMarkFixed:number = +avgMark.toFixed(2);
  return (
    <div>
        <p>{name}</p>
        <p>{lastname}</p>
        <p>{avgMarkFixed}</p>
    </div>
  )
}