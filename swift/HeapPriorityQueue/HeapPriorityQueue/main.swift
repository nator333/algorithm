//
//  main.swift
//  HeapPriorityQueue
//
//  Created by Masahiro on 2019-03-25.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

struct PriorityQueue<E: Comparable> {
    var queue: [E?]

    init(_ ary: [E?]) {
        queue = [E?]()
        queue.append(nil)

        queue.append(contentsOf: ary)
        buildMaxHeap()
    }

    mutating private func buildMaxHeap() {
        for index in (1...((queue.count - 1) / 2)).reversed() {
            maxHeapify(index)
        }
    }

    mutating private func maxHeapify(_ index: Int) {
        var leftIndex = 0
        var rightIndex = 0

        leftIndex = (index * 2)
        rightIndex = leftIndex + 1

        var largestIndex = index

        if leftIndex < queue.count && queue[leftIndex]! > queue[index]! {
            largestIndex = leftIndex
        }

        if rightIndex < queue.count && queue[rightIndex]! > queue[largestIndex]! {
            largestIndex = rightIndex
        }

        if largestIndex != index {
            // swap
            queue.swapAt(index, largestIndex)
            maxHeapify(largestIndex)
        }
    }

    mutating func insert(_ element: E) {
        queue.append(element)
        buildMaxHeap()
    }

    var max: E {
        return queue[1]!
    }

    mutating func extractMax() -> E {
        let result = queue[1]!
        let last = queue.removeLast()!
        queue[1] = last
        buildMaxHeap()
        return result
    }

    mutating func increaseKey(_ value: E, _ newMaxValue: E) {
        let index = queue.firstIndex(of: value)
        guard let unwrappedIndex = index else {
            return
        }

        queue[unwrappedIndex] = newMaxValue
        buildMaxHeap()
    }

    var description: String {
        return queue.description
    }
}


var unorderedAry = readLine()!.split(separator: " ").map {
    Int($0)!
}


var queue = PriorityQueue(unorderedAry)
print(queue.description)

queue.insert(10)
print(queue.description)

print(queue.max)
print(queue.description)

print(queue.extractMax())
print(queue.description)


queue.increaseKey(1, 100)
print(queue.description)


func heapSort(_ unorderedAry: inout [Int]) {

}

var heapSortAry = readLine()!.split(separator: " ").map {
    Int($0)!
}
heapSort(&heapSortAry)

print(heapSortAry)