//
//  main.swift
//  Island Count
//
//  Created by Masahiro on 2019-03-21.
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

struct Pair {
    let row: Int
    let col: Int
}

func simpleBFS(_ townMap: inout [[Int]], _ row: Int, _ col: Int, _ groupNum: Int, _ sizeAry: [Int], _ groupMap: inout [[Int]]) {
    // down, up, right, left, downRight, downLeft, upRight, upLeft
    let dRow = [0, 0, 1, -1, 1, -1, 1, -1]
    let dCol = [1, -1, 0, 0, 1, 1, -1, -1]

    var processQueue = Queue<Pair>()
    processQueue.enqueue(Pair(row: row, col: col))
    groupMap[row][col] = groupNum

    while !processQueue.isEmpty {
        let first = processQueue.dequeue()!
        let currentRow = first.row
        let currentCol = first.col

        // check directions
        for i in 0..<dRow.count {
            let forthRow = currentRow + dRow[i]
            let forthCol = currentCol + dCol[i]
            if (forthRow >= 0 && forthRow < sizeAry[1])
                       && (forthCol >= 0 && forthCol < sizeAry[0]) {
                if townMap[forthRow][forthCol] == 0 || groupMap[forthRow][forthCol] != 0 {
                    continue
                }

                processQueue.enqueue(Pair(row: forthRow, col: forthCol))
                groupMap[forthRow][forthCol] = groupNum
            }
        }
    }
}

func Island() {
    // Make townMap
    var islandMap = [[Int]]()
    let sizeAry = readLine()!.split(separator: " ").map {
        Int(String($0))!
    }
    for _ in 0..<sizeAry[1] {
        islandMap.append(readLine()!.split(separator: " ").map {
            Int(String($0))!
        })
    }

    // Count group num & paint groupMap by group num(1, 2, 3)
    var groupNum = 0
    var groupMap = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: sizeAry[0]), count: sizeAry[1])
    for row in 0..<sizeAry[1] {
        for col in 0..<sizeAry[0] {
            if islandMap[row][col] == 0 || groupMap[row][col] != 0 {
                continue
            }

            groupNum += 1
            simpleBFS(&islandMap, row, col, groupNum, sizeAry, &groupMap)
        }
    }

    printGroupMap(groupMap)

    print(groupNum)
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

Island()

