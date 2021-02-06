from flask import Flask
import random
app = Flask(__name__)

@app.route('/linear/<int:N>/<int:Values>', methods=['GET'])
def linea_search(N=None,Values=None):
    if(N > 100):
        lista = random.sample(range(1, (50+Values)), N)
    else:
        lista = random.sample(range(1, (100)), N)
    r = "no encontrado"
    for i in lista:
        if(i == Values):
            r = "Encontrado"
            break
    return f'La lista es: {lista}\n Numero a buscar: {Values}\n En metodo lineal: {r}'

@app.route('/binary/<int:N>/<int:Values>', methods=['GET'])
def binary_search(N=None,Values=None):
    if(N > 100):
        lista = random.sample(range(1, (50+Values)), N)
    else:
        lista = random.sample(range(1, (100)), N)
    r = "no encontrado"
    ls = len(lista)-1
    li = 0
    me = int(len(lista)/2)
    lista.sort()
    while (r == "no encontrado" and me > li and me < ls):
        if(Values <= lista[ls] and Values >= lista[me]):
            if(Values == lista[ls] or Values == lista[me]):
                r = "Encontrado"
            else:
                li = me
                me = int((li+ls)/2)
        elif(Values >= lista[li] and Values < lista[me]):
            if(Values == lista[li]):
                r = "Encontrado"
            else:
                ls = me
                me = int((li+ls)/2)
        else:
            break
    return f'La lista es: {lista}\n Numero a buscar: {Values}\n En metodo binario: {r}'

if __name__ == '__main__':
    app.run()