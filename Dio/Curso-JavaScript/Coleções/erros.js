function validaArray(arr, n){
    try {
        if (!arr && !n)  
            throw new ReferenceError('Envie os parametros');

        if (typeof arr !== "object") 
            throw new TypeError('Array precisa ser do tipo object');

        if (typeof n !== 'number')
            throw new TypeError('Array precisa ser do tipo number');

        if (arr.length !== n)
            throw new RangeError('Tamanho invalido');

        return arr
    } catch (e) {
        if  (e instanceof ReferenceError)  {
            console.log('erro de ReferenceError')
            console.log(e.message)
        } else if (e instanceof TypeError){
            console.log('erro de TypeError')
            console.log(e.message)
        }   else if (e instanceof RangeError){
            console.log('erro de RangeError')
            console.log(e.message)
        } else {
            console.log('outro erro' + e)
        }
    }
    
}

validaArray([],0);