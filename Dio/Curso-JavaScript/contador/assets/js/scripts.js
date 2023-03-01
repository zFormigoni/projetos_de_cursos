
var currentNumberWrap = document.getElementById("currentNumber");
var currentNumber = 0;


function increment(){
    currentNumber = currentNumber + 1
    currentNumberWrap.innerHTML = currentNumber
   
 
/*  Desafio 2 
    if (currentNumber == 10){currentNumber.innerHTML = 152
    }else{currentNumber = currentNumber + 1
        currentNumberWrap.innerHTML = currentNumber
    }
//*/
/*  Desafio 3 
if (currentNumber == 1 ){
    currentNumberWrap.classList.remove('negativo')
    currentNumberWrap.classList.add('positivo')
}
//*/
}

function decrement(){
    currentNumber = currentNumber - 1
    currentNumberWrap.innerHTML = currentNumber
   
 
/*  Desafio 2
    if (currentNumber == 0){currentNumber.innerHTML = 152
    }else{currentNumber = currentNumber - 1
        currentNumberWrap.innerHTML = currentNumber}
*/  
/*  Desafio 3   
if (currentNumber == -1 ){
    currentNumberWrap.classList.remove('positivo')
    currentNumberWrap.classList.add('negativo')
}
//*/
}



    
 
 
