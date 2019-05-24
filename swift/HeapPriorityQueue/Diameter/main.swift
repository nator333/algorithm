//
//  main.swift
//  Diameter
//
//  Created by Masahiro on 2019-03-26.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func printAdjAry(_ adjAry: [[Int]]) {
    print("=====\ngroupMap:")
    adjAry.forEach {
        print($0)
    }
    print("=====")
}

func dfs(_ graphAry: [[Int]], _ parent: Int, _ sum: inout Int, _ visited: inout [Bool], _ sumAry: inout [Int], _ sumIndexAry: inout [Int]) {
    visited[parent] = true
    var bottom = true
    for (nextIndex, next) in graphAry[parent].enumerated() {
        if next == 0 || visited[nextIndex] == true {
            continue
        }
        bottom = false
        sum += next
        dfs(graphAry, nextIndex, &sum, &visited, &sumAry, &sumIndexAry)
        sum -= next
    }

    if bottom {
        sumAry.append(sum)
        sumIndexAry.append(parent)
    }
}


func Diameter() {
    let size = Int(readLine()!)!
    // getting edges
    var graphAry = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: size), count: size)
    for _ in 0..<size {
        let intAry = readLine()!.split(separator: " ").map {
            Int($0)!
        }

        for i in stride(from: 1, to: intAry.count - 1, by: 2) {
            graphAry[intAry[0] - 1][intAry[i] - 1] = intAry[i + 1]
        }
    }

    printAdjAry(graphAry)

    var sum = 0
    var visited: [Bool] = Array<Bool>(repeating: false, count: size + 2)
    var sumAry = [Int]()
    var sumIndexAry = [Int]()
    dfs(graphAry, 0, &sum, &visited, &sumAry, &sumIndexAry)

    let maxIndex = sumIndexAry[sumAry.firstIndex(of: sumAry.max()!)!]
    sum = 0
    visited = Array<Bool>(repeating: false, count: size + 2)
    sumAry = [Int]()
    sumIndexAry = [Int]()
    dfs(graphAry, maxIndex, &sum, &visited, &sumAry, &sumIndexAry)

    print(sumAry.max()!)
}

Diameter()

