# coding: utf-8
import math

# Get prime numbers
number = int(input("Input certain number for prime numbers\n"))
print("==================")
primeAry = [True] * (number + 1)
primeAry[0] = primeAry[1] = False

for i in range(2, int(math.sqrt(number)) + 1):
    if not primeAry[i]:
        continue

    for j in range(2 * i, number, i):
        primeAry[j] = False

print(primeAry)
for i in range(len(primeAry)):
    if primeAry[i]: print(i)


# Teacher's answer
def list_of_primes_sieve(n):
    A = [True] * (n + 1)
    A[0] = A[1] = False
    sqrt_n = int(math.sqrt(n))
    for i in range(2, sqrt_n + 1):
        if A[i]:
            for j in range(2 * i, n + 1, i):
                A[j] = False

    return A


primes = list_of_primes_sieve(100)
for i in range(len(primes)):
    if primes[i]:
        print(i, end=' ')

#
##
