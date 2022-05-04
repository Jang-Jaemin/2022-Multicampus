import React from "react";
class BoardHeading extends React.Component {
  render() {
    return (
      <thead>
        <tr>
          <th>번호</th>
          <th>제목</th>
          <th>작성자</th>
          <th colSpan="2">추가동작</th>
        </tr>
      </thead>
    );
  }
}

class BoardRow extends React.Component {
  //BoardList 에서 전달받은 board 변수에 존재하는 게시물만큼 테이블 행 구성
  //constructor(props){
  //    super(props);
  // }
  //props.deleteBoard
  render() {
    //일반함수 =- this - 이벤트발생객체이다
    //리액트 화살표함수 - this 현재 클래스 객체  / event.target - 이벤트발생객체이다
    const deleteBoard = (event) => {
      //alert("삭제");
      this.props.deleteBoard(event.target.id);

      //삭제버튼 클릭한 게시물 번호받아서 this.props.deleteBoard (전달) 호출
    };
    const updateBoard = (event) => {
      //alert(" 수정");
      const oneBoard = { seq: event.target.id, title: "수정제목", writer: "수정작성자" };
      this.props.updateBoard(oneBoard);
    };

    const tr_tag = this.props.board.map(function (one) {
      return (
        <tr key={one.seq}>
          <td>{one.seq}</td>
          <td>{one.title}</td>
          <td>{one.writer}</td>
          <td>
            <button id={one.seq} onClick={deleteBoard}>
              삭제
            </button>
          </td>
          <td>
            <button id={one.seq} onClick={updateBoard}>
              수정
            </button>
          </td>
        </tr>
      );
    }); //map

    return <tbody>{tr_tag}</tbody>;
  }
}

class BoardWriteForm extends React.Component {
  //   constructor(props){
  //       super(props);
  //   }

  //props.addBoard 함수 전달받은 상태
  render() {
    // 제목, 작성자 입력 input 2개 정의
    // 글쓰기 button 1개 정의
    // 제목, 작성자 입력값 가져와서
    // 글쓰기 버튼 클릭하면 게시물번호를  현재게시물갯수+1 생성하여 alert 제목, 작성자, 번호 출력

    const oneboard = { seq: 0, titile: "", writer: "" }; //게시물입력정보저장용도객체

    const change = (event) => {
      // if(event.target.id === 'title' ) oneboard.title = event.target.value;
      // if(event.target.id ==='writer') oneboard.writer = event.target.value;
      oneboard[event.target.id] = event.target.value;
    };
    const finalChange = () => {
      oneboard.seq = this.props.board.length + 1;
      alert(oneboard.seq + ":" + oneboard.title + ":" + oneboard.writer);
      this.props.addBoard(oneboard);
    };

    return (
      <div>
        게시물제목 : <input type="text" id="title" onChange={change} />
        게시물작성자 : <input type="text" id="writer" onChange={change} />
        <button onClick={finalChange}> 글쓰기 </button>
      </div>
    );
  }
}

/* //test1 지역변수 board 선언 
class BoardList extends React.Component{
    //화면 구성 1번 호출 .
    render(){
        //지역변수 - 함수 시작시 초기화 / 종료 삭제
        const board= [
            {seq:1, title:'제목1', writer : "작성자1"},
            {seq:2, title:'제목2', writer : "작성자2"},
            {seq:3, title:'제목3', writer : "작성자3"},
            {seq:4, title:'제목4', writer : "작성자4"},
            {seq:5, title:'제목5', writer : "작성자5"}
            ]
            return ( <div><table border="5"> <BoardHeading /> <BoardRow board = {board} /></table> <BoardWriteForm  board={board}/> </div> );

    }

}
 */
/* //test2
class BoardList extends React.Component{
    //render메소드+다른메소드 접근 변수 사용-상태변경시마다 렌더링x
    board= [
        {seq:1, title:'제목1', writer : "작성자1"},
        {seq:2, title:'제목2', writer : "작성자2"},
        {seq:3, title:'제목3', writer : "작성자3"},
        {seq:4, title:'제목4', writer : "작성자4"},
        {seq:5, title:'제목5', writer : "작성자5"}
        ]

    //board  1개 게시물 추가 메소드 정의
    add=()=>{
        this.board.push({seq:6, title:'제목6', writer : "작성자6"});
        console.log(this.board.length);
    }

    //화면 구성 1번 호출 .
    render(){
                return ( <div><table border="5"> <BoardHeading /> <BoardRow board = {this.board} /></table> 
                <button onClick={this.add}>게시물추가</button>
                <BoardWriteForm  board={this.board}/> </div> );

    }

} */
/* //test3 - state 사용 
//리액트 클래스 내부 state 변수 존재 -  state 저장 변수값 변경시마다 render 재호출
class BoardList extends React.Component{
    //1.state 변수 선언
    state = {    board : [
        {seq:1, title:'제목1', writer : "작성자1"},
        {seq:2, title:'제목2', writer : "작성자2"},
        {seq:3, title:'제목3', writer : "작성자3"},
        {seq:4, title:'제목4', writer : "작성자4"},
        {seq:5, title:'제목5', writer : "작성자5"}
        ]  };

   

    //board  1개 게시물 추가 메소드 정의
    //3.state 내부 변수 setter - this.setState 메소드 호출 - 스프레드 연산자 
    add=()=>{
            const copyBoard = [...this.state.board ,  {seq:this.state.board.length+1, title:'제목6', writer : "작성자6"}  ];
            this.setState(    { board :  copyBoard }   );
           //this.board.push({seq:6, title:'제목6', writer : "작성자6"});
           console.log(this.state.board.length);
    }

    //화면 구성 1번 호출 .
    //2. state 내부 변수 getter - this.state.board 
    render(){
        
                return ( <div><table border="5"> <BoardHeading /> <BoardRow board = {this.state.board} /></table> 
                <button onClick={this.add}>게시물추가</button>
                <BoardWriteForm  board={this.state.board}/> </div> );

    }

} */
//test4 - state 사용 . 새글 - 배열 저장
//리액트 클래스 내부 state 변수 존재 -  state 저장 변수값 변경시마다 render 재호출
class BoardList extends React.Component {
  //1.state 변수 선언
  state = {
    board: [
      { seq: 1, title: "제목1", writer: "작성자1" },
      { seq: 2, title: "제목2", writer: "작성자2" },
      { seq: 3, title: "제목3", writer: "작성자3" },
      { seq: 4, title: "제목4", writer: "작성자4" },
      { seq: 5, title: "제목5", writer: "작성자5" },
    ],
  };

  //board  1개 게시물 추가 메소드 정의
  //3.state 내부 변수 setter - this.setState 메소드 호출 - 스프레드 연산자
  addBoard = (newBoard) => {
    const copyBoard = [...this.state.board, newBoard];
    this.setState({ board: copyBoard });
    console.log(this.state.board.length);
  };

  //this.props.deleteBoard(event.target.id);
  deleteBoard = (seq) => {
    // 삭제할 게시물 번호 전달받아서
    this.setState({
      board: this.state.board.filter(function (one) {
        return one.seq != seq;
      }),
    });
    //board 배열 에서 해당 게시물 삭제
  };

  updateBoard = (oneBoard) => {
    //board 배열에서 oneBoard.seq와 같은 데이터를 찾아서 제목을 oneBoard.title로, 작성자는 oneboard.writer 로 수정
    // 조건? true수행 : fasse 수행
    this.setState({
      board: this.state.board.map((one) =>
        one.seq == oneBoard.seq ? { ...this.state.board, seq: oneBoard.seq, title: oneBoard.title, writer: oneBoard.writer } : one
      ), //map end
    }); //setState end
  };
  //화면 구성 1번 호출 .
  //2. state 내부 변수 getter - this.state.board
  render() {
    return (
      <div>
        <table border="5">
          <BoardHeading />
          <BoardRow board={this.state.board} deleteBoard={this.deleteBoard} updateBoard={this.updateBoard} />
        </table>
        <BoardWriteForm board={this.state.board} addBoard={this.addBoard} />
      </div>
    );
  }
}
export default BoardList;
