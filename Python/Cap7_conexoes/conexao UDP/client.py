from socket import *

servidor = "127.0.0.1"
porta = 3001

obj_socket = socket(AF_INET, SOCK_DGRAM)
obj_socket.connect((servidor, porta))
saida = str

while saida != "X":
    msg = input("<Cliente> mensagem: ")
    obj_socket.sendto(msg.encode(), (servidor, porta))
    dados, origem = obj_socket.recvfrom(65_553)
    print("Resposta do servidor: ", dados.decode())
    saida = input("<X> para sair: ").upper()

obj_socket.close()
