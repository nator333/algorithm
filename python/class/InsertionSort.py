# day4 sort
## Insertion sort
numbers = [5, 4, 3, 2, 1]
currentIndex = 1
currentNum = 0
swapTempInt = 0
sortedLastIndex = 0
checkIndex = -1


## Factorial n
### 1. Iterative Way (Iteration)
def factorial_iteration(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result


### 2. Recursive Way (Recursive)
def factorial_recursive(n):
    if n == 1:
        return 1
    return n * factorial_recursive(n - 1)


print(factorial_recursive(5))


## 3. fibonacci Sequence
# if n = 4, answer is 3
# if n = 5, answer is 5
# n= 0 ,1, 2, 3, 4, 5
# a= 0, 1, 1, 2, 3, 5

### Iteration
def fibonacci_iteration(n):
    # Init
    result = 0
    first = 0
    second = 1
    # 0 or 1 doesn't need iteration
    if n < 2: return n
    # Iteration
    for i in range(n - 1):
        result = first + second
        first = second
        second = result

    return result


### Recursive
def fibonacci_recursive(n=3):
    if n < 2: return n
    return fibonacci_recursive(n - 2) \
           + fibonacci_recursive(n - 1)


times = 20
print("Fibonacci: Iteration answer is %s, Recursive answer is %s." \
      % (fibonacci_iteration(times), fibonacci_recursive(times)))
