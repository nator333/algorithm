//
//  main.swift
//  Floyd
//
//  Created by Masahiro on 2019-04-09.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func AdjacencyMatrix() -> [[Int]] {
    let vertices = Int(readLine()!)! // num of vertices
    let edges = Int(readLine()!)! // num of edges
    var matrix = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: vertices), count: vertices)

    // getting edges
    for _ in 0..<edges {
        let edge = readLine()!.split(separator: " ")
        let u = Int(edge[0])! - 1
        let v = Int(edge[1])! - 1
        matrix[u][v] = Int(edge[2])!
    }

    return matrix
}

func Floyd() {
    // Make townMap
    var routeMap = AdjacencyMatrix()
    printGroupMap(routeMap)

    for k in 0..<routeMap.count { // all intermediate vertices
        for i in 0..<routeMap.count {
            for j in 0..<routeMap.count {
                if i == j {
                    continue
                }
                if (routeMap[i][j] > routeMap[i][k] + routeMap[k][j]) {
                    routeMap[i][j] = routeMap[i][k] + routeMap[k][j]
                }
            }
        }
    }

    printGroupMap(routeMap)

}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    print("   ", terminator: "")
    for (index, _) in groupMap.enumerated() {
        print("\(index + 1)", terminator: "  ")
    }
    print("")
    for (index, row) in groupMap.enumerated() {
        print("\(index + 1) \(row)")
    }
    print("=====")
}

Floyd()

