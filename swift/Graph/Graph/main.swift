//
//  main.swift
//  Graph
//
//  Created by Masahiro on 2019-03-18.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func adjacencyMatrix() {
    let firstLineAry = getInput("Input 2 nums:").split(separator: " ")
    let n = Int(firstLineAry[0])!
    let m = Int(firstLineAry[1])!

    var matrix: [[Int]] = []
    for _ in 0..<n {
        matrix.append(Array<Int>(repeating: 0, count: m))
    }

    // Getting edges
    for _ in 0..<m {
        let edge = getInput("Input 2 nums for a edge:").split(separator: " ")
        let x = Int(edge[0])! - 1
        let y = Int(edge[1])! - 1
        matrix[x][y] = 1
        matrix[y][x] = 1
    }

    matrix.forEach {
        print($0)
    }
}

func adjacencyMatrixList() -> [[Int]] {
    let firstLineAry = getInput("Input 2 nums:").split(separator: " ")
    let n = Int(firstLineAry[0])!
    let m = Int(firstLineAry[1])!

    var matrix = Array<Array<Int>>(repeating: [], count: n + 1)

    // Getting edges
    for _ in 0..<m {
        let edge = getInput("Input 2 nums for a edge:").split(separator: " ")
        let x = Int(edge[0])! - 1
        let y = Int(edge[1])! - 1
        matrix[x].append(y)
        matrix[y].append(x)
    }

    matrix.forEach {
        print($0)
    }

    return matrix
}

func AdjacencyListWeighted() {
    let firstLine = readLine()!.split(separator: " ")
    let n = Int(firstLine[0])! // num of vertices
    let m = Int(firstLine[1])! // num of edges
    var adjList = Array<Array<(Int, Int)>>(repeating: [], count: n + 1)

    for _ in 0..<m {
        let edge = readLine()!.split(separator: " ")
        let u = Int(edge[0])!
        let v = Int(edge[1])!
        let w = Int(edge[2])!
        adjList[u].append((v: v, w: w)) // undirected u -> v, v -> u
        adjList[v].append((v: u, w: w))
    }
    print(adjList)
}

func getInput(_ prompt: String) -> String {
    print(prompt)
    var input: String = readLine()!
    while input.isEmpty {
        print("Input something:")
        input = readLine()!
    }
    return input
}

//adjacencyMatrix()


func getComponentsNum() -> Int {
    var list = AdjacencyMatrix()
    var visited = Array<Bool>(repeating: false, count: 1000)

    var count = 0
    for node in 1..<list.count {
        if visited[node] {
            bfs(start: 1, check: &visited, adjList: &list)
            count += 1
        }
    }

    print("count is \(count)")

    return 0

}

StoreInAdjacencyListBFS()