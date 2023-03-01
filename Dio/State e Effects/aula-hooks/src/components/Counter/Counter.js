function Counter() {
    var quantity = 10;
    
    function aumenta(){
        quantity = quantity + 1;
        document.getElementById('counter-number').innerHTML = quantity;
    } 



    return(
        <>
            <h1 id="counter-number">{quantity}</h1>
            <button onClick={ aumenta }>Aumentar</button>
        </>
    ) 
}


export default Counter;