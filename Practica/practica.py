
def suma(n):
    """
    Retorna (n*(n+1))/2
    >>> suma(100)
    5050.0
    """
    r = (n*(n+1))/2
    return r


def main():
    print("Sumatoria de los primeros N numeros")
    i = 1
    while(i == 1):
        numero = input("Ingrese el numero: ")
        t = numero.isdigit()
        print(t)
        if(t):
            numero = int(numero)
            respuesta = suma(numero)
            print(f"La sumatoria es: {respuesta}")
            res = input("Desea continuar (s), si no, ingrese cualquier cosa: ")
            if(res == "s"):
                pass
            else:
                i = 0
        else:
            print("Erro. Hay posibles errores como: \n1. Ingresar letras con numeros\n2. Numeros con signos(-/+)\n3. Numeros decimales\n Revise sus datos y prube de nuevo")

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
    main()