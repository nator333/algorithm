//
//  main.swift
//  Cyclic Permutation
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

    return matrix
}

func printAdjList(target: [[Bool]]) {
    print("=====================")
    print("   ", terminator: "")
    for (index, _) in target.enumerated() {
        print("\(index + 1)", terminator: "  ")
    }
    print("")
    for (index, row) in target.enumerated() {
        print("\(index + 1) \(row.map { $0 ? 1 : 0})")
    }
    print("=====================")
}


func dfs(start: Int, check: inout [Bool], adjList: inout [[Bool]]) {
    check[start] = true
    for (index, next) in adjList[start].enumerated() {
        if next && check[index] == false {
            dfs(start: index, check: &check, adjList: &adjList)
        }
    }
}

func getComponentsNum(adjList: inout [[Bool]], n: Int) -> Int {
    // dfs (depth first search)
    var check: [Bool] = Array<Bool>(repeating: false, count: n)
    var count = 0
    for node in 0..<adjList.count {
        if !check[node] {
            dfs(start: node, check: &check, adjList: &adjList)
            count += 1
        }
    }

    return count

}


print("Cases num:")
let caseNum = Int(readLine()!)!
for _ in 0..<caseNum {

    print("Elements num:")
    let elementNum = Int(readLine()!)!
    print("Elements:")
    let intAry = readLine()!.split(separator: " ").map {
        Int($0)!
    }

    if (intAry.count != elementNum) {
        print("Invalid Input")
        exit(1)
    }
    let sortedAry = intAry.sorted()

    var matrix = Array<Array<Bool>>(repeating: Array<Bool>(repeating: false, count: sortedAry.max()!), count: sortedAry.max()!)

    for index in 0..<intAry.count {
        matrix[sortedAry[index] - 1][intAry[index] - 1] = true
    }

    printAdjList(target: matrix)

    print("Answer: \(getComponentsNum(adjList: &matrix, n: elementNum))")

}

