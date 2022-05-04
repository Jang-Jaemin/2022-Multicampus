import React from "react";

class B extends React.Component {
  render() {
    const user = { id: "아이디", password: "1234", name: "이름", phone: "010-1111-2222", email: "a@a.com", address: "서울시" };
    return (
      <div>
        <h1>클래스 형태의 리액트 컴포넌트</h1>
        <h3>{user.id}</h3>
        <h3>{user.password}</h3>
        <h3>{user.name}</h3>
        <h3>{user.phone}</h3>
        <h3>{user.email}</h3>
        <h3>{user.address}</h3>
      </div>
    );
  }
}

export default B;
