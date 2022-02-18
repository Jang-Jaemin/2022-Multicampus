function StyleAdd() {
    const css1 = {
        'color': 'red',
        'background-color': '#f0f0ff',
        'font-size': '2em'
    }

    const css2 = {
        'color': 'blue',
        'backgroundColor': '#f0f0ff',
        'fontSize': '1.5em'
    }

    return (
        <div> {/* 여기에 주석을 작성합니다. */}
            <p style={css1}>React 구조를 배우는 중입니다.</p>
            <p style={css2}>스타일 변수를 jsx에 적용하는 중입니다.</p>
            <p class="App">텍스트는 중앙정렬, 글씨색상은 연녹색입니다.</p>
        </div>
    );
}
export default StyleAdd;