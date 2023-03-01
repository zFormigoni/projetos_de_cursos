function calculaSaldo(saldo, lista){
    return lista.reduce(function(prev, current){
        console.log(prev +' - '+ current.preco +' = '+ (prev - current.preco) );
/*                
? valor anterior, valor que sera diminuido com o novo(current): prev = 1
? item atual exemplo: {item: 'item 1', preco: 1}:               current = 1
! exemplo: prev(100) - current.preco({item: 'item 1', preco: 1}) = 99 
! prev(100) - current.preco(1) = 99
*/    
        return prev - current.preco;
    }, saldo);
}


const lista = [
    {item: 'item 1', preco: 1},
    {item: 'item 2', preco: 2}, 
    {item: 'item 3', preco: 3}, 
    {item: 'item 4', preco: 4}, 
    {item: 'item 5', preco: 5}
]
var valor = 100;

calculaSaldo(valor, lista);
