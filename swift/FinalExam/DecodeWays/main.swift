//
//  main.swift
//  DecodeWays
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

// Masa
func numDecodings(_ s: String) -> Int {
    if s.first! == "0" || s.contains("0") {
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


numDecodings("1")


