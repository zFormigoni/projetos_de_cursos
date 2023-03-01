def menu():
    return input(
        "Oque deseja fazer\n"+
        "<I> Inserir usuario\n"
        "<P> Pesquisar usuario\n"
        "<E> Excluir usuario\n"
        "<L> Listar usuarios\n"
    ).upper()


def inserir(dicionario):
    dicionario[input("Digite o login: ").upper()] = [
        input("Digite o Nome: "),
        input("Digite a uiltima data de acesso: "),
        input("Digite a uiltima estação acessada: ")
        ]

    salvar(dicionario)


def salvar(dicionario): 
    with open("bd.txt", "a") as arquivo:
        for chave, valor in dicionario.items():
            arquivo.write(chave + ":" + str(valor)) 



usuarios = {}
opcao = menu()

while opcao == "I" or opcao == "P" or opcao == "E" or opcao == "L":
    if opcao == "I":
        inserir(usuarios)
    opcao = menu()
