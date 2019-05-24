//
//  main.swift
//  SumOfSquare
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func SumOfSquare(_ target: Int) -> Bool {
    let sqrtTarget = Int(Double(target).squareRoot())
    for a in stride(from: 0, through: sqrtTarget, by: 1) {
        let b = target - (a * a)
        if binarySearch(0, b, b) {
            return true
        }
    }

    return false
}

func binarySearch(_ low: Int, _ high: Int, _ target: Int) -> Bool {
    var low = low
    var high = high

    while low <= high {
        let mid = (low + high) / 2
        if mid * mid == target {
            return true
        } else if mid * mid < target {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    
    return false
}

// double for loop
print(SumOfSquare(5))