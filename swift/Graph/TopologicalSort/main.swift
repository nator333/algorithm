//
//  main.swift
//  TopologicalSort
//
//  Created by Masahiro on 2019-03-26.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

struct PriorityQueue<E> where E: Comparable {
    private var elements: Heap<E>

    var isEmpty: Bool {
        return elements.isEmpty
    }

    var count: Int {
        return elements.count
    }

    init() {
        elements = Heap<E>()
    }

    func peek() -> E? {
        return elements.max()
    }

    mutating func enqueue(_ elem: E) {
        elements.insert(elem)
    }

    mutating func dequeue() -> E? {
        return elements.extractMax()
    }

    mutating func increaseKey(at index: Int, with value: E) {
        elements.replace(at: index, with: value)
    }

}

struct Heap<E>: CustomStringConvertible where E: Comparable {
    var description: String {
        return nodes.description
    }

    private var nodes = [E]()

    var isEmpty: Bool {
        return nodes.isEmpty
    }

    var count: Int {
        return nodes.count
    }

    init() {
    }

    @inline(__always) func parent(of i: Int) -> Int {
        return Int((i - 1) / 2)
    }

    @inline(__always) func left(of i: Int) -> Int {
        return i * 2 + 1
    }

    @inline(__always) func right(of i: Int) -> Int {
        return i * 2 + 2
    }

    public func max() -> E? {
        return nodes.first
    }

    mutating func insert(_ value: E) {
        nodes.append(value)
        bubbleUp(nodes.count - 1)
    }

    mutating func bubbleUp(_ index: Int) {
        var index = index
        let current = nodes[index]
        var parentIndex = self.parent(of: index)
        while index > 0 && nodes[index] < nodes[parentIndex] {
            nodes[index] = nodes[parentIndex]
            index = parentIndex
            parentIndex = self.parent(of: index)
        }
        nodes[index] = current
    }

    mutating func maxHeapify(_ index: Int) {
        let l = self.left(of: index)
        let r = self.right(of: index)
        var largest = index
        if l < self.count && nodes[l] < nodes[index] {
            largest = l
        }
        if r < self.count && nodes[r] < nodes[largest] {
            largest = r
        }
        if largest != index {
            nodes.swapAt(index, largest)
            maxHeapify(largest)
        }
    }

    mutating func extractMax() -> E? {
        let max = nodes.first
        nodes.swapAt(0, nodes.count - 1)
        nodes.remove(at: nodes.count - 1)
        maxHeapify(0)
        return max
    }

    mutating func replace(at index: Int, with value: E) {
        guard index < nodes.count, nodes[index] < value else {
            return
        }
        nodes.remove(at: index)
        insert(value)
    }
}

extension Heap {
    mutating func buildMaxHeap(_ arr: [E]) {
        self.nodes = arr
        for i in stride(from: nodes.count / 2 - 1, through: 0, by: -1) {
            print(i)
            maxHeapify(i)
        }
    }

    mutating func heapSort(_ arr: [E]) -> [E] {
        var result = [E]()
        buildMaxHeap(arr)
        while !nodes.isEmpty {
            nodes.swapAt(count - 1, 0)
            result.append(nodes.remove(at: count - 1))
            maxHeapify(0)
        }
        return result
    }
}

func AdjacencyMatrix() -> [[Int]] {
    let firstLine = readLine()!.split(separator: " ")
    let vertices = Int(firstLine[0])! // num of vertices
    let edges = Int(firstLine[1])! // num of edges
    var matrix = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: vertices), count: vertices)

    // getting edges
    for _ in 0..<edges {
        let edge = readLine()!.split(separator: " ")
        let u = Int(edge[0])! - 1
        let v = Int(edge[1])! - 1
        matrix[u][v] = 1
    }

    return matrix
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

func topologicalSort() {
    var adjAry = AdjacencyMatrix()
    printAdjAry(adjAry)
    var queue = PriorityQueue<Int>()
    var procesedAry = Array<Bool>(repeating: false, count: adjAry.count)
    procesedAry[0] = true

    for i in 0..<adjAry.count {
        var noDependency = true
        for j in 0..<adjAry.count {
            if adjAry[j][i] == 1 {
                noDependency = false
            }
        }
        if noDependency {
            queue.enqueue(i + 1)
            procesedAry[i] = true
        }
    }

    print(queue)

    while !queue.isEmpty {
        let elm = queue.dequeue()!
        print(elm, terminator: " ")
        procesedAry[elm - 1] = true
        // solve dependency
        for i in 0..<adjAry.count {
            adjAry[elm - 1][i] = 0
        }
        // enqueue
        for i in 0..<adjAry.count {
            if procesedAry[i] {
                continue
            }
            var noDependency = true
            for j in 0..<adjAry.count {
                if adjAry[j][i] == 1 {
                    noDependency = false
                }
            }
            if noDependency {
                queue.enqueue(i + 1)
                procesedAry[i] = true
            }
        }
    }
    print("")
}

topologicalSort()

