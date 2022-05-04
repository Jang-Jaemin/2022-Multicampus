import { Routes, Route } from "react-router-dom";
import Main from "./Main";
import Board from "./Board";
import BoardList from "./BoardList";

const App2 = () => {
  return (
    <Routes>
      <Route path="/" element={<Main />} />
      <Route path="/boardlist" element={<BoardList />} />
      {/* <Route path="/board" element={<Board seq="1" />} /> */}
      <Route path="/board/:seq" element={<Board />} />
    </Routes>
  );
};

export default App2;
