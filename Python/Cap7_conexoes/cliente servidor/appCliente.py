from socket import *

servidor = "127.0.0.1"
porta = 3000

msg = bytes("mensagem do cliente", "utf-8")
obj_socket = socket(AF_INET, SOCK_STREAM)
obj_socket.connect((servidor, porta))   #! Conecta ao servidor
obj_socket.send(msg)

resposta = obj_socket.recv(1024)
print("resposta: ", resposta)
obj_socket.close()

