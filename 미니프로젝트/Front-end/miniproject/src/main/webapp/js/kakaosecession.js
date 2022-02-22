window.Kakao.init("45342ac41cf6e9ade1d1fd96081960b5");
function secession() {
  Kakao.API.request({
    url: "/v1/user/unlink",
    success: function (response) {
      console.log(response);
      alert("정상적으로 회원탈퇴 처리 되었습니다. 감사합니다.");
      //callback(); //연결끊기(탈퇴)성공시 서버에서 처리할 함수
      window.location.href = "http://127.0.0.1:5500/src/main/webapp/main.html";
    },
    fail: function (error) {
      console.log("탈퇴 미완료");
      console.log(error);
    },
  });
}
