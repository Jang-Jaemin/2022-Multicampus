function Greeting() {
    var r = parseInt(Math.random() * 3);
    if(r == 0) return (
        <div><h1>오늘도 즐거운 하루 되세요</h1>
        <a href="#">링크</a></div>
    );
    if(r == 1) return <h1>안녕하세요, 리액트!</h1>;
    if(r == 2) return <h1>오늘 날씨 어때요?</h1>;
}
export default Greeting;