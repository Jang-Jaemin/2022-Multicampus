// test1
// const Board = (props) => {
//   return (
//     <div>
//       <h1>{props.seq}번 게시글입니다.</h1>
//     </div>
//   );
// };

// test2
import { useParams } from "react-router-dom";

const Board = () => {
  const { seq } = useParams();
  return (
    <div>
      <h1>{seq}번 게시글입니다.</h1>
    </div>
  );
};

export default Board;
