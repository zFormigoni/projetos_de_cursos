from pydoc import cli
from socket import *

servidor = "127.0.0.1"
porta = 3000

obj_socket = socket(AF_INET, SOCK_STREAM)
obj_socket.bind((servidor, porta))
obj_socket.listen(2)    #! Quantidade maxima de clientes que podem se conectar

print("aguardando cliente...")

while True:
    con, client = obj_socket.accept()
    print("conectado com: ", client)
    while True:
        msg_recebida = str(con.recv(1024))
        print("mensagem recebida: ", msg_recebida)
        msg_enviada = b'mensagem enviada pelo servidor'
        con.send(msg_enviada)
        break
    con.close()
