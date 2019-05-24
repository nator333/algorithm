//
//  main.swift
//  Pokemon
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func Pokemon(_ map: inout [[Int]]) -> Int {
    //var points = [[Int]](repeating: [Int](repeating: 0, count: map[0].count), count: map.count)
    for i in 0..<map.count {
        for j in 0..<map[i].count {
            // map[i  - 1][j], map[i][j -1]
            var sum = 0
            if i - 1 >= 0 {
                sum = map[i - 1][j]
            }
            if j - 1 >= 0 && sum < map[i][j - 1] {
                sum = map[i][j - 1]
            }
            map[i][j] += sum
        }
    }

    printGroupMap(map)

    return map[map.count - 1][map[0].count - 1]
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

let sizeMap = readLine()!.split(separator: " ").map {
    Int($0)!
}
var map = [[Int]](repeating: [Int](), count: sizeMap[0])
for i in 0..<sizeMap[0] {
    map[i] = readLine()!.split(separator: " ").map {
        Int($0)!
    }
}

print(Pokemon(&map))

