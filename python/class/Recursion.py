# coding: utf-8
## No.1
def rec(n=1) -> int:
    if n < 4:
        return n
    else:
        return rec(n - 1) + rec(n - 2)


for i in range(1, 10):
    print(rec(i))


## No.2
def recStairs(n=1) -> int:
    if n < 3:
        return n
    elif n == 3:
        return 4
    return recStairs(n - 1) + recStairs(n - 2) + recStairs(n - 3)


for i in range(1, 10):
    print(recStairs(i))

# 1 1
# 2 (1, 1), (2) == 2
# 3 (1, 2) * 2, (3), (1, 1, 1) ==  4
# 4 (1, 3) * 2, (1, 1, 2) * 3, (2, 2), (1, 1, 1, 1) == 7 
# 5 (2, 3) *2, (1, 2, 2) * 3, (1, 1, 1, 2) * 4, (1, 1, 1, 1, 1), (3, 1, 1) * 3 == 15
