//
//  Search.swift
//  SwiftAGDS
//
//  Created by Masahiro on 2019-03-07.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

// Time Complexity
//   way to measure efficiency
// O(n) - worst case
// O(1) - contant time
// O(n * n) - exponential time
// 𝛉 - theta consider fastest case as well
func linearSerch(target: Int, from array: [Int]) -> Int {
    for (index, elem) in array.enumerated() {
        if elem == target {
            return index
        }
    }
    return -1
}


func binarySerach(_ arr: [Int], target: Int) -> Int {
    var lower = 0
    var upper = arr.count - 1
    while (lower <= upper) {
        let mid = (lower + upper) / 2
        if (arr[mid] == target) {
            return mid
        } else if (arr[mid] < target) {
            lower = mid + 1
        } else {
            upper = mid - 1
        }
    }
    return -1
}

