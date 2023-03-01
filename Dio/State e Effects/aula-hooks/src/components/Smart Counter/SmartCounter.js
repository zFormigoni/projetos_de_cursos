import {useState} from 'react';

function SmartCounter(){

    const [quantity,aumenta] = useState(1);

    return(
        <>
            <h1 >{quantity}</h1>
            <button onClick={()=> aumenta(quantity + 1)}>Aumentar</button>
        </>
    ) 
}

export default SmartCounter