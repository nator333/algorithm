//
//  main.swift
//  MaximumSubarray
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func maxSubArray(_ nums: [Int]) -> Int {
    var memo = [Int](repeating: 0, count: nums.count)
    memo[0] = nums[0]

    for i in 1..<nums.count {
        if nums[i] + memo[i - 1] > nums[i] {
            memo[i] = nums[i] + memo[i - 1]
        } else if memo[i - 1] < nums[i] {
            memo[i] = nums[i]
        } else {
            memo[i] = memo[i - 1]
        }
    }
    print(memo)

    return memo.max()!
}


//let ary = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
let ary = [-2, -1, -3]
print(maxSubArray(ary) == -1)



