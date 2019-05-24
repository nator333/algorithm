//
//  Sortings.swift
//  SwiftAGDS
//
//  Created by Masahiro on 2019-03-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Sortings: NSObject {

    static func bubbleSort(_ arr: inout [Int]) {
        for i in (1...(arr.count)).reversed() {
            for j in 0..<(i - 1) {
                if arr[j] > arr[j + 1] {
                    arr.swapAt(j, j + 1)
                }
            }
        }
    }

    static func selectionSort(_ arr: inout [Int]) {
        for i in 0..<arr.count {
            // random min
            var minIndex = i
            for j in (i + 1)..<(arr.count) {
                // get min val
                if arr[j] < arr[minIndex] {
                    minIndex = j
                }
            }
            // swap
            arr.swapAt(i, minIndex)
        }
    }

    static func insertionSort(_ arr: inout [Int]) {
        for i in 1..<arr.count {
            let insert = arr[i]
            var j = i - 1
            while j >= 0 {
                if insert < arr[j] {
                    arr[j + 1] = arr[j]
                } else {
                    break
                }
                j -= 1
            }
            arr[j + 1] = insert
        }
    }

    static func mergeSort(_ arr: [Int]) -> [Int] {
        var arr = arr
        // if arr size is 1 return arr
        if arr.count == 1 {
            return arr
        }
        let midIndex = arr.count / 2
        let left = mergeSort(Array(arr[..<midIndex]))
        let right = mergeSort(Array(arr[midIndex...]))

        return merge(left, right)
    }

    static func merge(_ left: [Int], _ right: [Int]) -> [Int] {
        var i = 0, j = 0
        var result = [Int]()
        while i < left.count && j < right.count {
            if left[i] < right[j] {
                result.append(left[i])
                i += 1
            } else {
                result.append(right[j])
                j += 1
            }
        }

        if i == left.count {
            result += right[j...]
        } else {
            result += left[i...]
        }

        return result
    }

    static func quickSort(_ arr: inout[Int], _ low: Int = 0, _ high: Int = 0) {
        if (low >= high) {
            return
        }

        let pivotIndex = partition(&arr, low, high)
        quickSort(&arr, low, pivotIndex - 1)
        quickSort(&arr, pivotIndex + 1, high)
    }

    static func partition(_ arr: inout [Int], _ low: Int, _ high: Int) -> Int {
        let pivotNum = arr[high]
        var leftMark = low
        var rightMark = high - 1

        while leftMark <= rightMark {

            while leftMark <= rightMark && arr[leftMark] < pivotNum {
                leftMark += 1
            }

            while rightMark >= leftMark && arr[rightMark] >= pivotNum {
                rightMark -= 1
            }

            if leftMark > rightMark {
                break
            }

            // Swap
            let swap = arr[leftMark];
            arr[leftMark] = arr[rightMark];
            arr[rightMark] = swap;
        }

        // Swap
        let swap = arr[leftMark];
        arr[leftMark] = pivotNum;
        arr[high] = swap;

        return leftMark
    }

}

// 1. Bubble Sort
// - too many swaps
// - bubble up the largest one to the right


// 2. Selection Sort
// - each scan select min and put it the left

// 3. Insertion Sort
// - unsorted | sorted
// - inserting elem from unsorted portion into sorted portion

// 4. Merge Sort O(n log n)
// much space complexity O(n)

// 5. Quick Sort O(n log n)
// much space complexity O(n)
