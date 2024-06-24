//
//  main.swift
//  LongestIncreasingSubsequence
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func LongestIncreasingSubsequence(_ ary: [Int]) -> Int {
    var answers = [Int](repeating: 0, count: ary.count)
    for i in 0..<ary.count {
        answers[i] = 1
    }
    
    for i in 1..<ary.count {
        for j in 0..<i {
            if ary[j] < ary[i] && answers[j] + 1 > answers[i] {
                answers[i] = answers[j] + 1
            }
        }
    }

    print(answers)

    return answers[ary.count - 1]
}

let ary = [10, 20, 10, 30, 20, 50]
print(LongestIncreasingSubsequence(ary))

