//
//  main.swift
//  numDecodings
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func numDecodings(_ s: String) -> Int {
    if s.first! == "0" || s.contains("00") {
        return 0
    }
    var memo = [Int](repeating: 0, count: s.count)
    var decodeLetterAry = s.map {
        Int(String($0))!
    }
    if decodeLetterAry[0] != 0 {
        memo[0] = 1
    }

    for index in 1..<decodeLetterAry.count {
        let twoLts = String(decodeLetterAry[index - 1]) + String(decodeLetterAry[index])
        let twoDigits = Int(twoLts)!
        if twoDigits == 0 {
            break
        }

        if decodeLetterAry[index] == 0 {
            if twoDigits <= 26 {
                if index - 2 >= 0 {
                    memo[index] = memo[index - 2]
                } else {
                    memo[index] = 1
                }
            }
        } else {
            if twoLts.first! != "0" && twoDigits <= 26 {
                if index - 2 >= 0 {
                    memo[index] = memo[index - 1] + memo[index - 2]
                } else {
                    memo[index] = memo[index - 1] + 1
                }
            } else {
                memo[index] = memo[index - 1]
            }
        }
    }

    return memo.last!
}

print(numDecodings("12") == 2)
print(numDecodings("27") == 1)
print(numDecodings("226") == 3) // 2, 2, 6 / 22, 6 / 2, 26
print(numDecodings("229") == 2) // 2, 2, 9 / 22, 9
print(numDecodings("10") == 1) // 10
print(numDecodings("100") == 0) //
print(numDecodings("230") == 0) // 
print(numDecodings("00") == 0)
print(numDecodings("12120") == 3) // 1, 2, 1, 20 / 12, 1, 20, / 1, 21, 20
print(numDecodings("30") == 0)
print(numDecodings("301") == 0)
print(numDecodings("1010") == 1)
print(numDecodings("101") == 1)
print(numDecodings("1212") == 5) // 1,2,1,2 / 12, 1, 2 / 1, 21, 2 / 1, 2, 12 / 12, 12

