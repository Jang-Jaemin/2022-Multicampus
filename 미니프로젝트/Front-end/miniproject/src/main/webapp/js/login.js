var userlist = ["test"];

window.onload = function () {
  var button = document.getElementById("login");
  button.onclick = function () {
    var text = document.getElementById("id");
    var password = document.getElementById("pw");
    var password2 = document.getElementById("pw2");
    var div = document.getElementById("result");

    for (a in userlist) {
      if (userlist[a] == text.value) {
        if (password.value == password2.value) {
          alert("정상적으로 로그인 되었습니다.");
          location.href =
            "http://127.0.0.1:5500/src/main/webapp/header_login.html";
        } else {
          alert("암호를 다시 입력해주세요.");
          location.href = "http://127.0.0.1:5500/src/main/webapp/login.html";
        }
        break;
      } else {
        alert("아이디가 존재하지 않습니다. 회원가입이 필요합니다.");
        alert("회원가입 페이지로 이동합니다.");
        location.href = "http://127.0.0.1:5500/src/main/webapp/register.html";
      }
    }
  };
};
