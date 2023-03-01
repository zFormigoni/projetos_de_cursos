const meuArray = [10,20,30,30,40,50,60,50,70,80,90,90,100];

function valoresUnicos(array){
    const mySet = new Set(array);

    return [...mySet];
}

console.log(valoresUnicos(meuArray))