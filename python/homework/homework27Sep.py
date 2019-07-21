# coding: utf-8
import unittest


# day6 Merge sort
## main merge sort function
def mergeSort(ary):
    numbLen = len(ary)
    leftAry = []
    rightAry = []
    midIndex = 0
    if numbLen < 2: return ary

    midIndex = numbLen // 2
    leftAry = mergeSort(ary[:midIndex])
    rightAry = mergeSort(ary[midIndex:])

    return mergeArys(leftAry, rightAry)


## sub merge sort function
def mergeArys(aAry, bAry) -> []:
    mergedAry = []
    i = 0
    j = 0
    while i < len(aAry) and j < len(bAry):
        if aAry[i] < bAry[j]:
            mergedAry.append(aAry[i])
            i += 1
        else:
            mergedAry.append(bAry[j])
            j += 1

    while i < len(aAry):
        mergedAry.append(aAry[i])
        i += 1
    while j < len(bAry):
        mergedAry.append(bAry[j])
        j += 1

    return mergedAry


## Test
class TestMergeSort(unittest.TestCase):
    def test(self):
        print("============================================================== MergeSort start")
        nums = [9, 4, 3, 1, 7, 0]
        nums.sort()
        self.assertListEqual(nums, mergeSort(nums))
        nums = [1, 2, 3]
        nums.sort()
        self.assertListEqual(nums, mergeSort(nums))
        nums = [109082, 4232, 0, -1, 5, 6]
        nums.sort()
        self.assertListEqual(nums, mergeSort(nums))
        nums = [0]
        nums.sort()
        self.assertListEqual(nums, mergeSort(nums))
        print("============================================================== MergeSort   end")


unittest.main()
