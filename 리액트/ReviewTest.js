function A() {
  // const clickHandler = function () { alert("버튼클릭"); };
  const clickHandler = () => alert("버튼클릭");
  const css1 = { color: "green" };
  const list = ["리스트1", "리스트2", "리스트3", "리스트4"];
  const li_tag = list.map((one, index) => <li key={index}>{one}</li>);
  return (
    <div>
      <h1>리액트 실행</h1>
      <ul style={css1}>{li_tag}</ul>
      <button onClick={clickHandler}>
        <h3>클릭</h3>
      </button>
    </div>
  );
}

export default A;
