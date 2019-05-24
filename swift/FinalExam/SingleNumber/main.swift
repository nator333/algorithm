//
//  main.swift
//  SingleNumber
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        var sumDic = [Int: Int]()
        for i in 0..<nums.count {
            sumDic[nums[i]] = 0
        }

        for i in 0..<nums.count {
            sumDic[nums[i]] = sumDic[nums[i]]! + 1
        }

        for (key, value) in sumDic {
            if value == 1 {
                return key
            }
        }

        return 0
    }
}


var ary = [4, 1, 2, 1, 2]
print(Solution().singleNumber(ary))

