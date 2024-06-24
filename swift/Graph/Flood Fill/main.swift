//
//  main.swift
//  Flood Fill
//
//  Created by Masahiro on 2019-03-20.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func getInt(_ prompt: String) -> Int {
    return Int(getInput(prompt))!
}

func getIntAry(_ prompt: String) -> [Int] {
    var result = Array<Int>()
    for item in getInput(prompt) {
        result.append(Int(item.description)!)
    }

    return result
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
    print(start + 1)
    print(adjList[start])
    for (index, next) in adjList[start].enumerated() {
        if next && check[index] == false {
            dfs(start: index, check: &check, adjList: &adjList)
        } else {
            print("found start:\(start + 1), next:\(next), index:\(index)")
        }
    }
}

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

func bfs(start: Int, check: inout [Bool], adjList: inout [[Bool]]) {
    var queue: Queue<Int> = Queue<Int>()
    check[start] = true
    queue.enqueue(start)
    while !queue.isEmpty {
        let first = queue.dequeue()!
        print(first + 1)
        for (index, next) in adjList[start].enumerated() {
            if next && check[index] == false {
                check[index] = true
                queue.enqueue(index)
            }
        }
    }
}


func simpleBFS(_ townMap: inout [[Int]], _ row: Int, _ col: Int, _ groupNum: Int, _ size: Int, _ groupMap: inout [[Int]]) {
    let dx = [0, 0, 1, -1]
    let dy = [1, -1, 0, 0]

    struct Pair {
        let row: Int
        let col: Int
    }

    var processQueue = Queue<Pair>()
    processQueue.enqueue(Pair(row: row, col: col))
    groupMap[row][col] = groupNum

    while !processQueue.isEmpty {
        let first = processQueue.dequeue()!
        let currentRow = first.row
        let currentCol = first.col

        // check 4 directions
        for i in 0..<4 {
            let forthRow = currentRow + dx[i]
            let forthCol = currentCol + dy[i]
            if (forthRow >= 0 && forthRow < size)
                       && (forthCol >= 0 && forthCol < size) {
                if townMap[forthRow][forthCol] == 0 || groupMap[forthRow][forthCol] != 0{
                    continue
                }

                processQueue.enqueue(Pair(row: forthRow, col: forthCol))
                groupMap[forthRow][forthCol] = groupNum
                printGroupMap(groupMap)
            }
        }
    }
}

func Town() {
    // Make townMap
    var townMap = [[Int]]()
    let size = Int(readLine()!)!
    for _ in 0..<size {
        townMap.append(readLine()!.map {
            Int(String($0))!
        })
    }

    // Count group num & paint groupMap by group num(1, 2, 3)
    var groupNum = 0
    var groupMap = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: size), count: size)
    for row in 0..<size {
        for col in 0..<size {
            if townMap[row][col] == 0 || groupMap[row][col] != 0{
                continue
            }

            groupNum += 1
            simpleBFS(&townMap, row, col, groupNum, size, &groupMap)
        }
    }

    printGroupMap(groupMap)

    print(groupNum)

    var answer = [Int](repeating: 0, count: size * size)
    for i in 0..<size {
        for j in 0..<size {
            answer[groupMap[i][j]] += 1
        }
    }
    answer = Array(answer[1...groupNum])
    answer.sort()
    for i in 0..<groupNum {
        print(answer[i])
    }
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

Town()

/*

// Make adjacent list
let size = getInt("Input size")
var shape = Array<Array<Bool>>(repeating: Array<Bool>(repeating: false, count: size), count: size)

for i in 0..<size {
    let intAry = getIntAry("")
    for (j, intVal) in intAry.enumerated() {
        shape[i][j] = intVal == 1 ? true : false
    }
}

// default print
printAdjList(target: shape)

var check: [Bool] = Array<Bool>(repeating: false, count: size)

var count = 0
for node in 0..<shape.count {
    if !check[node] {
        dfs(start: node, check: &check, adjList: &shape)
        //bfs(start: node, check: &check, adjList: &shape)
        count += 1
    }
}

print("count is \(count)")
*/
