function filtraPares(arr) {
    return arr.filter(function callback (item){
        return item % 2 === 0;          //  ? aqui entra a regra para o filtro
    });
}



const num = [1,2,3,4,5,6,7,8,9,10];

console.log(filtraPares(num));