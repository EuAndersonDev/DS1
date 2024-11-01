N = int(input())
nome = ""
valor = 0

for _ in range(N):
    nomeInput = input()
    valorInput = int(input())

    if valorInput > valor:
        valor = valorInput
        nome = nomeInput

print(nome)
print(valor)
