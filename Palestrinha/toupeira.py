S, T = map(int, input().split());
array = [[] for _ in range(S+1)];
cc = 0;

for _ in range(T):
    X, Y = map(int, input().split());
    array[X].append(Y);
    array[Y].append(X);

P = int(input());

for _ in range(P):
    caminho = list(map(int, input().split()));
    flag = True;

    for i in range(1, len(caminho) - 1):
        valorSalaoAtual = caminho[i];
        valorProxSalao = caminho[i+1];
    
        if not(valorProxSalao in array[valorSalaoAtual]):
            flag = False;
            break; 
    if flag: cc += 1;
print(cc);