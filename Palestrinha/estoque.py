M, N = map(int, input().split());
matriz = [];
cc = 0;

for _ in range(M):
    linha = list(map(int, input().split()));
    matriz.append(linha);

P = int(input());
for _ in range(P):
    I, J = map(int, input().split());
    I -= 1;
    J -= 1;

    if matriz[I][J] > 0:
        cc += 1;
        matriz[I][J] -= 1;

print(cc);
