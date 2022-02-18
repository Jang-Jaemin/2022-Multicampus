const HeaderPart = (props) => (
    <div style={{backgrounColor: 'red', color: 'white'}}>
        <h3>{props.title}</h3>
    </div>
)

const BodyPart = (props) => (
    <div style={{border: '2px solid blue', margin: '15px'}}>
        <h3>{props.body}</h3>
    </div>
)

const Book = (props) => (
    <div>
        <HeaderPart title={props.title}></HeaderPart>
        <BodyPart body={props.body}></BodyPart>
    </div>
)
export default Book;