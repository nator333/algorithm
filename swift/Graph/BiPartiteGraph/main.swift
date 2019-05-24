//
//  main.swift
//  BiPartiteGraph
//
//  Created by Masahiro on 2019-03-19.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

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
        matrix[v][u] = 1
    }

    print("=====================")
    print("   ", terminator: "")
    for (index, row) in matrix.enumerated() {
        print("\(index + 1)", terminator: "  ")
    }
    print("")
    for (index, row) in matrix.enumerated() {
        print("\(index + 1) \(row)")
    }
    print("=====================")

    return matrix
}

func dfsForBipartite(start: Int, color: Int, check: inout [Int], adjList: inout [[Int]]) {
    check[start] = color
    for next in adjList[start] {
        if check[next] == 0 {
            dfsForBipartite(start: next, color: (3 - color), check: &check, adjList: &adjList)
        }
    }
}

func isBipartite(_ adjList: inout [[Int]]) -> Bool {

    var visited = Array<Int>(repeating: 0, count: adjList.count)

    for node in 1..<adjList.count {
        dfsForBipartite(start: node, color: 1, check: &visited, adjList: &adjList)
    }

    print("visited: \(visited)")



    return false
}

let graphNum = Int(readLine()!)!
var graphList = Array<[[Int]]>()

for _ in 0..<graphNum {
    graphList.append(AdjacencyMatrix())
}

graphList.forEach {
    var list = $0
    print(isBipartite(&list))
}


