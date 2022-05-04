import axios from "axios";
import { useState } from "react";

function ServerConnection() {
  const [result, setResult] = useState("");

  // test1
  //   axios.get("/helloreact").then(function (response) {
  //     result = JSON.stringify(response.data);
  //   });

  // test2 : get
  //   axios.get("/helloreactparam", { params: { id: "get전송", password: 1234 } }).then(function (response) {
  //     setResult(JSON.stringify(response.data));
  //   });

  // test3 : post
  //   axios.post("/helloreactparampost", { id: "post전송", password: 1234 }).then(function (response) {
  //     setResult(JSON.stringify(response.data));
  //     console.log(result);
  //   });

  // test4 : userlist
  axios.get("/userlist", { params: { id: "get전송", password: 1234 } }).then(function (response) {
    setResult(JSON.stringify(response.data));
  });
  return (
    <div>
      <h1>통신시작</h1>
      <h1>{result}</h1>
      <h1>통신끝</h1>
    </div>
  );
}

export default ServerConnection;
