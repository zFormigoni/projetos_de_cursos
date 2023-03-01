import React, {useState, useEffect} from 'react'
import '../IfoodCounter/IfoodCounter.css';

export default function IfoodCounter() {

    const [value, setValue] = useState(0);
    const [buttonStyle, setButtonStyle] = useState('counter-button' )
    useEffect(() => {
        document.getElementById('moeda').innerHTML = 2.00 * value;
    },[value])

    function up(){
        setValue(value + 1);
    }

    function down(){
        setValue(value - 1);
    }

  return (
    <div className='countex-wrapper'>

        <button 
        className={buttonStyle}
        onClick={down}>  -   </button>

        <p>{value}</p>

        <button 
        className={buttonStyle}
        onClick={up}>  +   </button>

        <button id='moeda'>

        </button>
    </div>
  )
}
