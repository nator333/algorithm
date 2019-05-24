//
//  main.swift
//  Dijkstra
//
//  Created by Masahiro on 2019-03-28.
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

func printAdjAry(_ matrix: [[Int]]) {
    print("   ", terminator: "")
    for index in 0..<matrix.count {
        print("\(index + 1)", terminator: "  ")
    }
    print("")
    for (index, row) in matrix.enumerated() {
        print("\(index + 1) \(row)")
    }
}

struct Path {
    var to: Int
    var cost: Int
}

func dijkstra() {
    let vertices = Int(readLine()!)!
    let edges = Int(readLine()!)!
    var cost = [Int](repeating: Int.max, count: vertices)
    var visited = [Bool](repeating: false, count: vertices)
    var adjAry2 = [[Path]](repeating: [], count: vertices)
    var adjAry = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: vertices), count: vertices)

    for _ in 0..<edges {
        let input = readLine()!.split(separator: " ").map {
            Int($0)!
        }
        adjAry2[input[2]].append(Path(to: input[1], cost: input[2]))
        adjAry[input[0] - 1][input[1] - 1] = input[2]
    }

    let distInput = readLine()!.split(separator: " ").map {
        Int($0)!
    }
    let start = distInput[0]
    let end = distInput[1]

    print(adjAry2)
    printAdjAry(adjAry)

    for _ in 0..<vertices {
        var min = Int.max
        var x = -1
        for i in 1...edges {
            if !visited[i] && min > cost[i] {
                min = cost[i]
                x = i
            }
        }

        visited[x] = true
        for node in adjAry2[x] {
            if cost[node.to] > cost[x] + node.cost {
                cost[node.to] = cost[x] + node.cost
            }
        }
    }

    print(cost)

}

dijkstra()

