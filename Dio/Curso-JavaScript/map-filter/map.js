function mapComThis (arr, thisArg) {
    return arr.map(function(item){
        return item * this.value;
    }, thisArg)
}

function mapSemThis (arr) {
    return arr.map(function(item){
        return item * 2;
    })
}

const maca      = {value: 2,}
const laranja   = {value: 3,}

const num = [1, 2, 3, 4];

console.log('Sem this -> : '    + mapSemThis(num));
console.log('this -> maca: ' + mapComThis(num, maca));