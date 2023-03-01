'''
#! "w" write 
arquivo = open("arquivoTXT.txt", "w")  
arquivo.write("teste")
arquivo.close
#! "a" append
with open("arquivoTXT.txt", "a") as arquivo:    
    arquivo.writelines("teste")
'''

with open("arquivoTXT.txt", "r") as arquivo:
    for linha in arquivo.readlines():
        print(linha)

""" print("arquivo alterado") """