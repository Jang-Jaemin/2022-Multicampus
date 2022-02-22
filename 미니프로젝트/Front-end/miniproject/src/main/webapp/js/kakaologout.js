window.Kakao.init("45342ac41cf6e9ade1d1fd96081960b5");
function kakaoLogout() {
  if (!Kakao.Auth.getAccessToken()) {
    console.log("로그인 중이 아닙니다.");
    return;
  }
  Kakao.Auth.logout(function (response) {
    alert("정상적으로 로그아웃 되었습니다.");
    window.location.href = "http://127.0.0.1:5500/src/main/webapp/main.html";
  });
}
