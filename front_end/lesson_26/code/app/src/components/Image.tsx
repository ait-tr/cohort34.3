type Props = {
    url:string
    alt:string
};

export default function Image({url, alt}: Props) {
  return (
    <img src={url} alt={alt} />
  )
}