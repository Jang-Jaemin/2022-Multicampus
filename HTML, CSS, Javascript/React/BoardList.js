import React from "react";
class BoardHeading extends React.Component{
    render(){
        return  (
        <thead><tr><th>번호</th><th>제목</th><th>작성자</th>
        <th>조회수</th></tr></thead>);
    }
}
//warning 무시
class BoardLine extends React.Component{
    //data 매개변수 전달받을 수 있도록 
    constructor(props){
        super(props); //this.props = props;
    }
    render(){
        const board_tr = this.props.data.map(function(oneboard){
           // console.log(oneboard.seq);
            return (<tr key={oneboard.seq}><td>{oneboard.seq}</td>
            <td>{oneboard.title}</td><td>{oneboard.writer}</td>
            <td>{oneboard.view}</td></tr>);
        });
        console.log(board_tr);
        return (<tbody>{board_tr}</tbody>);
    }
}


class BoardList extends React.Component{
    
    render(){  //db -> 배열 형태 ->jquery(반복문) ->reactㅡmap 
        const board = [
    {seq:'1', title:'제목1', writer:"작성자1", view:"10"},
    {seq:'2', title:'제목2', writer:"작성자2", view:"11"},
    {seq:'3', title:'제목3', writer:"작성자3", view:"30"},
    {seq:'4', title:'제목4', writer:"작성자4", view:"55"},
    {seq:'5', title:'제목5', writer:"작성자5", view:"0"}
        ];
        
        return(<table border="3">
            <BoardHeading /> 
            <BoardLine data={board} /> 
            </table>);
    }
}

export default BoardList;//index.js
