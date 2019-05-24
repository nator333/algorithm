# coding: utf-8
import math
# day5 Mathematic
## If a number n is a prime number
def isPrime(argNumber=3):
    print("argNumber is %s" % str(argNumber))
    # 0, 1 is not prime number
    if argNumber < 2: return False
    isPrime = True
    
    # 1. divide the lower number than argNumber other than 1 :2
    for i in range(2, argNumber) :
        # 2. if the any remainders were not 0, it is prime number
        if argNumber % i == 0:
            isPrime = False
            break

    return isPrime

## Test
testMsg = "Is this number Prime number? Answer = %s"
print(testMsg % str(isPrime(13)))
print(testMsg % str(isPrime(1)))
print(testMsg % str(isPrime(2)))
print(testMsg % str(isPrime(17)))
print(testMsg % str(isPrime(100)))

## use square root calculation
def isPrime2(argNumber=3):
    sqrtNumber = int(math.sqrt(argNumber))
    for i in range(2, sqrtNumber + 1):
        if argNumber % i == 0:
            return False
    return True

## Test
print(testMsg % str(isPrime2(13)))
print(testMsg % str(isPrime2(1)))
print(testMsg % str(isPrime2(2)))
print(testMsg % str(isPrime2(17)))
print(testMsg % str(isPrime2(100)))
