def par_ou_impar(numero):
    if numero % 2 == 0:
        return "Par"
    else:
        return "Ímpar"

# Exemplo de uso
numero = 5
resultado = par_ou_impar(numero)
print(f"O número {numero} é {resultado}.")