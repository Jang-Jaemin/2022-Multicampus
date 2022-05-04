import { Link } from "react-router-dom";

const Main = () => {
  return (
    <div>
      <h1>메인화면 입니다.</h1>
      <Link to="/boardlist">게시판이동</Link>
      <br />
      <Link to="/board/1">게시물1</Link>
      <br />
      <Link to="/board/2">게시물2</Link>
      <br />
      <Link to="/board/3">게시물3</Link>
    </div>
  );
};

export default Main;
