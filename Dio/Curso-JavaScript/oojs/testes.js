class ContaBancaria{
    constructor(agencia, numero, tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = 0;
    }
    
    get getSaldo() {
        return this._saldo;
    }
    
    set setSaldo(valor) {
        this._saldo = valor;
    }

    sacar(valor){
        if (this._saldo < valor){
            return 'operação negada';
        }else{
            var saldoInicial = this._saldo;
            var saldoFinal = saldoInicial - valor;
            this._saldo = saldoFinal;   
            return this._saldo;  
        }
       
        
    }

    depositar(valor){
        var saldoInicial = this._saldo;
        var saldoFinal = (saldoInicial + valor);
        this._saldo = saldoFinal;
        return this._saldo;
    }
}

class ContaCorrente extends ContaBancaria{
    constructor(agencia, numero, cartaoCredito){
        super(agencia, numero);
        this.tipo = 'Conta Corrente';
        this._cartaoCredito = cartaoCredito;
    }

    get getCartaoCredito(){
        return this._cartaoCredito
    }

    set setCartaoCredito(valor){
        this._cartaoCredito = valor;
        return this._cartaoCredito
    }



}

class ContaPoupanca extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Conta Poupança';
    }


}

class ContaUniversitaria extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Conta Universitaria';
    }

    sacar(valor){
        if (valor > 500){
            return 'saque negado';
        } else{
            this._saldo = this._saldo - valor;
        }
    }
}



//const minhaConta = new ContaCorrente(1, 001, true);

//const minhaConta = new ContaPoupanca(2, 002);

const minhaConta = new ContaUniversitaria(3, 003);

console.log(minhaConta.tipo);