V = int(input())
A = int(input())
F = int(input())
P = int(input())

array = [A, F, P]
array.sort()
cc = 0

while cc < 3 and V >= array[cc]:
    V -= array[cc]
    cc += 1

print(cc)

