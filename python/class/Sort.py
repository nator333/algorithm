# day3 sort
import copy
loopCount = 0
## selection sort
sortTargetIndex = 0
compareTargetIndex = 1
tempSavedNum = 0
originalUnsortedNumbers = [4343, 4, 44, 3, 76, 5, 6, 7, 78, 8, 1, 9]
unsortedNumbers = copy.deepcopy(originalUnsortedNumbers)
minNum = 0
maxNum = 0
isAscend = True if input("ascend? y/n") == "y" else False
print("isAscend : %s" % isAscend)

while sortTargetIndex < len(unsortedNumbers):
    minNum = unsortedNumbers[sortTargetIndex]
    compareTargetIndex = sortTargetIndex + 1
    while compareTargetIndex < len(unsortedNumbers):
        loopCount += 1
        if isAscend :
            # Ascend : if minNum is not min number
            if minNum > unsortedNumbers[compareTargetIndex]:
                # update minmum number
                minNum = unsortedNumbers[compareTargetIndex]
                # print("minNum was updated as %s" % minNum)
                # swap
                tempSavedNum = unsortedNumbers[sortTargetIndex]
                unsortedNumbers[sortTargetIndex] = \
                    unsortedNumbers[compareTargetIndex]
                unsortedNumbers[compareTargetIndex] = \
                    tempSavedNum
        else :
            # Descend : if maxNum is not max number
            if maxNum < unsortedNumbers[compareTargetIndex]:
                # update maximum number
                maxNum = unsortedNumbers[compareTargetIndex]
                print("maxNum was updated as %s" % maxNum)
                # swap :    
                tempSavedNum = unsortedNumbers[sortTargetIndex]
                unsortedNumbers[sortTargetIndex] = \
                    unsortedNumbers[compareTargetIndex]
                unsortedNumbers[compareTargetIndex] = \
                    tempSavedNum
        compareTargetIndex = compareTargetIndex + 1
    sortTargetIndex = sortTargetIndex + 1
    
print("Result is %s, loop count is %s" %(unsortedNumbers, loopCount))

## bubble sort
loopCount = 0
isCompleted = False
tempSavedNum = 0
unsortedNumbers = copy.deepcopy(originalUnsortedNumbers)
minNum = 0
maxNum = 0
bubblePositionIndex = 0

# teacher's answer
swapCount = -1
j = len(unsortedNumbers) - 1
while swapCount != 0:
    swapCount = 0
    for i in range(j): # 3 times
        loopCount += 1
        if unsortedNumbers[i] > unsortedNumbers[i + 1] :
            swapCount += 1
            tempSavedNum = unsortedNumbers[i]
            unsortedNumbers[i] =unsortedNumbers[i + 1]
            unsortedNumbers[i + 1] = tempSavedNum
    j -= 1

print("Teacher's answer is %s, loop count is %s" %(unsortedNumbers, loopCount))

# common answer
unsortedNumbers = copy.deepcopy(originalUnsortedNumbers)
loopCount = 0
for i in range(len(unsortedNumbers) - 1, 0, -1):
    for j in range(i):
        loopCount += 1
        if unsortedNumbers[j] > unsortedNumbers[j + 1]:
            tempSavedNum = unsortedNumbers[j]
            unsortedNumbers[j] =unsortedNumbers[j + 1]
            unsortedNumbers[j + 1] = tempSavedNum

print("Common answer is %s, loop count is %s" %(unsortedNumbers, loopCount))