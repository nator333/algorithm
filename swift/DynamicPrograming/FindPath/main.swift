//
//  main.swift
//  FindPath
//
//  Created by Masahiro on 2019-04-09.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var answer = [Int:Int]()
        for i in nums {
            answer[i] = target - i
        }

        print(answer)

        for i in answer {
            if answer[i.value] == i.key {
                return [i.value - 1, i.key - 1]
            }
        }
        return []
    }
}


print(Solution().twoSum([2,7,11,15], 9))
