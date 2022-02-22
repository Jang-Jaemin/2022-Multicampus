window.Kakao.init("45342ac41cf6e9ade1d1fd96081960b5");

function kakaoLogin() {
  window.Kakao.Auth.login({
    scope: "profile_nickname, profile_image, account_email, gender, birthday", //동의항목 페이지에 있는 개인정보 보호 테이블의 활성화된 ID값을 넣습니다.
    success: function (response) {
      console.log(response); // 로그인 성공하면 받아오는 데이터
      window.Kakao.API.request({
        // 사용자 정보 가져오기
        url: "/v2/user/me",
        success: (res) => {
          const kakao_account = res.kakao_account;
          console.log(kakao_account);
        },
      });
      window.location.href =
        "http://127.0.0.1:5500/src/main/webapp/header_login.html"; //리다이렉트 되는 코드
    },
    fail: function (error) {
      console.log(error);
    },
  });
}
