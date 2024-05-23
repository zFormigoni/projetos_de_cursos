menu = """
[1] Depositar 
[2] Sacar
[3] Historico 
[4] Sair

Digite uma ação: 
"""
vlrConta = 0
movimentacoes = []

def entradaVlr(opc):
    e_numero = False
    print('------------------------------')
    if opc == 1:
        print("Deposito")
    if opc == 2:
        print("Saque")
    
    while e_numero == False:
        valor = input("Valor R$: ")
        e_numero = valor.replace('.', '', 1).isdigit() or (valor.lstrip('-').replace('.', '', 1).isdigit() and valor.count('.') == 1)
    print('------------------------------')
    return int(valor)


def Depositar (): 
    global vlrConta 

    valor = entradaVlr(1)
    vlrConta += valor
    movimentacoes.append('Deposito de R$' + str(valor))

def Sacar (): 
    global vlrConta 

    valor = entradaVlr(2)
    if valor > vlrConta:
        print("Saldo insuficiente")
    elif valor < vlrConta:    
        vlrConta -= valor  
        movimentacoes.append('Saque de R$' + str(valor))

def valorFinal ():
        print(f'Valor na conta: R${vlrConta}')    
   
qntSaques = 0
while True: 

    resposta = int(input(menu))
    if resposta == 1:
        Depositar()
        valorFinal()

    elif resposta == 2:
        if qntSaques == 3:
            print("saques maximos alcançados para essa sessao")
            continue
        else:
            Sacar()
            valorFinal()
            qntSaques += 1 
    elif resposta == 3:
        for movimentacao in movimentacoes:
            print('------------------------------')
            print(movimentacao)
            print('------------------------------')
        valorFinal()

    elif resposta == 4:
            break
    else: 
        reposta = int(input("insira uma resposta valida: "))
