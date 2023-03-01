function soma(arr){
    return arr.reduce(function callback(current, prev){
        console.log(current + '+' + prev)

        return current + prev;
    })
}

num = [1,2,3,4,5,6];

console.log(soma(num));