//
//  main.swift
//  BinaryTree
//
//  Created by Masahiro on 2019-03-27.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

struct Queue<T> {
    var array = [T]()

    var count: Int {
        return array.count
    }

    var isEmpty: Bool {
        return array.isEmpty
    }

    var peek: T? {
        return array.first
    }

    // O(1)
    mutating func enqueue(_ e: T) {
        array.append(e)
    }

    // O(n)
    mutating func dequeue() -> T? {
        if isEmpty {
            return nil
        } else {
            return array.removeFirst()
        }
    }
}

struct Pair {
    let row: Int
    let col: Int
}

func AdjacencyMatrix(_ tree: inout [Int]) -> [[Int]] {
    let size = Int(readLine()!)!
    var matrix = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: size), count: size)
    tree = Array<Int>(repeating: 0, count: size + 1)
    tree[1] = -1

    // getting edges
    for _ in 0..<size - 1 {
        let edge = readLine()!.split(separator: " ")
        let u = Int(edge[0])! - 1
        let v = Int(edge[1])! - 1
        if tree[u + 1] != 0 {
            tree[v + 1] = u + 1
            matrix[u][v] = 1
        } else if tree[v + 1] != 0 {
            tree[u + 1] = v + 1
            matrix[v][u] = 1
        }
    }

    print(tree)

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

func bfs(_ adjAry: [[Int]], _ rowIndex: Int, _ colIndex: Int, _ visited: inout [[Bool]]) {
    var depth = 1
    var queue = Queue<Pair>()
    for i in 0..<adjAry.count {
        if adjAry[rowIndex][i] == 1 {
            queue.enqueue(Pair(row: rowIndex, col: i))
        }
    }

    while !queue.isEmpty {
        let first = queue.dequeue()!
        print(first)
        visited[first.row][first.col] = true
        depth += 1

        for index in 0..<adjAry.count {
            if adjAry[first.col][index] == 0 {
                continue
            }

            if !visited[first.col][index] {
                let new = Pair(row: first.col, col: index)
                queue.enqueue(new)
                print("enqueued:\(new)")
                visited[first.col][index] = true
            }
        }
    }

}

func BinaryTreeOn() {
    var tree = [Int]()
    AdjacencyMatrix(&tree)

    let qSize = Int(readLine()!)!
    for _ in 0..<qSize {
        let qInputAry = readLine()!.split(separator: " ").map {
            Int($0)!
        }

        if qInputAry.contains(1) {
            print(1)
            return
        }

        var parentAry = [Int]()
        var answer = qInputAry[0]
        parentAry.append(answer)

        while true {
            let sth = tree[answer]
            if sth == -1 {
                break
            }
            parentAry.append(sth)
            answer = sth
        }

        answer = qInputAry[1]
        if parentAry.contains(answer) {
            print(answer)
            return
        }

        while true {
            let sth = tree[answer]
            if parentAry.contains(sth) {
                print(sth)
                break
            } else {
                answer = sth
            }
        }
    }

    //var visited = Array<[Bool]>(repeating: Array<Bool>(repeating: false, count: adjAry.count), count: adjAry.count)
    //bfs(adjAry, 0, 0, &visited)

}

BinaryTreeOn()


func dfs(_ tree: [Int], _ visited: inout [Bool], _ start: Int) {
    let parent = tree[start]
    visited[start] = true

    for i in tree.count {
        if tree[i] == parent {

        }
    }

}

func BinaryTreeLogn() {
    var tree = [Int]()
    AdjacencyMatrix(&tree)

    let qSize = Int(readLine()!)!
    for _ in 0..<qSize {
        let qInputAry = readLine()!.split(separator: " ").map {
            Int($0)!
        }

        if qInputAry.contains(1) {
            print(1)
            return
        }

        // dfs?

    }

}

BinaryTreeLogn()
