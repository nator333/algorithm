//
//  main.swift
//  BackFirstSearch
//
//  Created by Masahiro on 2019-03-18.
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

    mutating func enqueue(_ e: T) {
        array.append(e)
    }

    mutating func dequeue() -> T? {
        if isEmpty {
            return nil
        } else {
            return array.removeFirst()
        }
    }
}

func bfs(start: Int, check: inout [Bool], adjList: inout [[Int]]) {
    var queue: Queue<Int> = Queue<Int>()
    check[start] = true
    queue.enqueue(start)
    while !queue.isEmpty {
        let first = queue.dequeue()!
        print(first)
        for v in adjList[first] {
            if check[v] == false {
                check[v] = true
                queue.enqueue(v)
            }
        }
    }
}

func StoreInAdjacencyListBFS() {
    let firstLine = readLine()!.split(separator: " ")
    let n = Int(firstLine[0])! // num of vertices
    let m = Int(firstLine[1])! // num of edges
    var adjList = Array<Array<Int>>(repeating: [], count: n + 1)

    for _ in 0..<m {
        let edge = readLine()!.split(separator: " ")
        let u = Int(edge[0])!
        let v = Int(edge[1])!
        adjList[u].append(v) // undirected u -> v, v -> u
        adjList[v].append(u)
    }

    // BFS (Breadth First Search)
    var check: [Bool] = Array<Bool>(repeating: false, count: n + 1)
    bfs(start: 1, check: &check, adjList: &adjList)

}
