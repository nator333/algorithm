# day1 Basic of python

print("Hello World")

# variable
# conditional statement
# print
# input
# loop

# variable
name = "Masa"
year = 2018

if year < 2020:
    print("year is less than 2020")
elif year >= 1990:
    print("1990 <= year <= 2020")
else:
    print("less than 1990")

# input
score = input("Please input number your score:\n")

# convert function
score = int(score)  # int(), float(), str()

printStr = "Your grade is..."

if score >= 90:
    printStr += "A"
    if score >= 100:
        printStr += "\nCongrats!!"
elif score >= 80:
    printStr += "B"
elif score >= 70:
    printStr += "C"
elif score >= 60:
    printStr += "D"
else:
    printStr += "F"

# loop
total = 0
## for each number number from range 1 to 10
## increment the number by 1
## step by certain number
scoreRange = range(1, 11, 2)
print("Loop Range is " + str(scoreRange))
for i in scoreRange:
    ## add number to total
    total = total + i
## print total
print("Total is " + str(total) + "\n")

# factorial
result = 1
factorialRange = \
    range(1, int(input("Please input the number you want to see factorial:\n")) + 1)
print("Factorial Range is " + str(factorialRange))
for step in factorialRange:
    result *= step
    step += 1
print("Result is " + str(result))

# print
print("\n================")
print(name)
print(year)
print(printStr)
print("================")
