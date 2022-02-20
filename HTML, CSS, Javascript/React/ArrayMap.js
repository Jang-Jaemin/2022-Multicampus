import React from "react";
class ArrayMap extends React.Component{
    render(){
        const menus=[{name :'한식', location:'서울'}, 
        '분식' ,'일식', '중식', '베트남식'];
/*          const menus_copy = menus.map(function(one, index){ 
                return (<li key={index}> {index} 번째 메뉴 = 
                {one.name}:{one.location}</li>);
       });  */
       //one.name 존재하면 {one.name}:{one.location}
       //그렇지 않으면 {one}
       const menus_copy = menus.map(function(one, index){ 
        return (<li key={index}> {index} 번째 메뉴 = 
        { one.name? `${one.name}:${one.location}` :
        `${one}` }  </li>);
        }); 
        return(<ul>{menus_copy}</ul>);
    }
}
export default ArrayMap;