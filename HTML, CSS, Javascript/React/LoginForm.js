//클래스 선언식
import React from "react";
class LoginForm extends React.Component{
  

render(){ 
  const clickHandler=(event)=>{alert(event.target.value); }
  const changeHandler=(event)=>{alert(event.target.value); }
    return (<div>
아이디입력:<input type='text' id="id" name="id"  onChange={changeHandler}  /><br/>
암호입력:<input type='password' id="password" name="password" 
 onChange={changeHandler}  /><br/>
<input type='button' id="send" name="send" value='전송' onClick={clickHandler}/>
</div>); 
}//render end
}//class end
export default LoginForm;

