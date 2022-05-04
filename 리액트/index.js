import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import "./index.css";
// import App from "./App";
import reportWebVitals from "./reportWebVitals";
// import A from "./ReviewTest";
// import B from "./ReviewTest2";
// import Book from "./ReviewTest3";
// import User from "./ReviewTest4";
// import BoardList from "./BoardList";
// import ServerConnection from "./ServerConnection";
import App2 from "./App2";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <React.StrictMode>
      {/* <App />
      <A />
      <B />
      <Book />
      <User name="홍길동" address="서울" />
      <BoardList />
      <ServerConnection /> */}
      <App2 />
    </React.StrictMode>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
