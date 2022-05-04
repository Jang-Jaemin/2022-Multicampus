import React from "react";

class User extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      name: this.props.name,
      address: this.props.address,
    };
  }
  render() {
    const greeting = () => {
      //   alert(this.props.name + " 회원님은 " + this.props.address + " 지역에 살고 있습니다.");
      alert(this.state.name + " 회원님은 " + this.state.address + " 지역에 살고 있습니다.");
    };

    const finalChange = (e) => {
      this.setState({ [e.target.id]: "" });
    };

    const change = (e) => {
      console.log(e.target.tagName + ":" + e.target.id + ":" + e.target.value);
      this.setState({ [e.target.id]: e.target.value });
    };

    return (
      <div>
        <button onClick={greeting}>인사</button>

        <input type="text" id="name" onChange={change} />
        <input type="text" id="address" onChange={change} />

        <button onClick={finalChange}>변경</button>
      </div>
    );
  }
}

export default User;
