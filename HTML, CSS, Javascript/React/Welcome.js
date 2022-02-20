import './Welcome.css';

const Welcome = (n) => (
    <div className="welcome">
    {n.age ? 
    `환영합니다 ${n.name}  회원님  ${n.age}  살이고 전공은 ${n.major} 입니다.  이번학기는  ${n.score} 점수를 받았습니다.` : 
    `환영합니다 ${n.name}  회원님`}
    </div>
)
export default Welcome;