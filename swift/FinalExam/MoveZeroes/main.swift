//
//  main.swift
//  MoveZeroes
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Solution {
    func moveZeroes(_ nums: inout [Int]) {
        var zeroCount = 0
        for i in 0..<nums.count {
            if nums[i] == 0 {
                zeroCount += 1
            }
        }

        var ary = [Int]()
        for i in 0..<nums.count {
            if nums[i] != 0 {
                ary.append(nums[i])
            }
        }

        for i in 0..<zeroCount {
            ary.append(0)
        }

        nums = ary
    }
}

var ary = [0, 1, 0, 3, 12]
Solution().moveZeroes(&ary)
//Solution().moveZeroes(&[1])

