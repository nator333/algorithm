# day2 Search
## Linear Search
print("======== Linear Search : start ========")
names = ["Kano", "Masa", "Rodrigo", "Derrick", "Ayana", "Yuto", "Alex"]
target = input("Please type the name you want to search:\n")

namesLen = len(names)
print("names Length is %s" % namesLen)
for i in range(namesLen):
    if i + 1 == namesLen:
        print("Target %s wasn't found"  % target)
    if names[i] == target:
        print("target index was %s" % i)
        break
    else:
        ++i
print("========= Linear Search : end =========")

## Binary Search
import sys
print("======== Binary Search : start ========")
numbers = [100, 200, 300, 400, 500, 600, 700]
target = int(input("Please type the number you want to search:\n"))
minIndex = 0
maxIndex = len(numbers) - 1
print("numbers Length is %s" % len(numbers))

midIndex = minIndex + maxIndex // 2

# 700
while minIndex <= maxIndex:
    midIndex = (minIndex + maxIndex) // 2
    if numbers[midIndex] == target:
        print("target index was %s" % midIndex)
        break
    if numbers[midIndex] < target :
        minIndex = midIndex + 1
    else :
        maxIndex = midIndex - 1
else:
    print("Target %s wasn't found"  % target)

print("======== Binary Search : end =======")

