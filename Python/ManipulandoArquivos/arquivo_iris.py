from shutil import which


db = []

with open("iris.data", "r") as arquivo:
    for linha in arquivo.readlines():
        db.append(linha.split(","))

print(db[49])