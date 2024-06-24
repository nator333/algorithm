//
//  main.swift
//  FizzBuzz
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Solution {
    func fizzBuzz(_ n: Int) -> [String] {
        var result = [String]()
        for i in 1...n {
            switch i {
            case let i where i % 3 == 0 && i % 5 == 0:
                result.append("FizzBuzz")
            case let i where i % 3 == 0:
                result.append("Fizz")
            case let i where i % 5 == 0:
                result.append("Buzz")
            default:
                result.append(i.description)
            }
        }

        return result
    }


    func reverse(_ x: Int) -> Int {
        var x: Int = x
        var rev: Int = 0;
        while (x != 0) {
            let pop: Int = x % 10;
            x /= 10;
            if (rev > Int.max / 10 || (rev == Int.max / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Int.min / 10 || (rev == Int.min / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    func reverseVowels(_ s: String) -> String {
        let vowels = ["a", "i", "u", "e", "o"]
        var sAry = s.map { String($0)}


        var vAry = [String]()
        var bAry = [Bool]()
        for i in sAry {
            if vowels.contains(i.lowercased()) {
                bAry.append(true)
                vAry.append(i)
            } else {
                bAry.append(false)
            }
        }

        vAry.reverse()

        var j = 0
        for i in 0..<s.count {
            if bAry[i] {
                sAry[i] = vAry[j]
                j += 1
            }
        }
        return sAry.joined()
    }

    func selfDividingNumbers(_ left: Int, _ right: Int) -> [Int] {
        var result = [Int]()
        for i in left...right {
            let digits = i.description.map {
                Int(String($0))!
            }

            if digits.contains(0) {
                continue
            }

            var noSelf = true
            for j in digits {
                if i % j != 0 {
                    noSelf = false
                }
            }
            if noSelf {
                result.append(i)
            }
        }

        return result
    }

    func findTheDifference(_ s: String, _ t: String) -> Character {
        var sSet = Set(s.map {
            String($0)
        })
        var tSet = Set(t.map {
            String($0)
        })

        return Character(tSet.subtracting(sSet).first!)
    }
}

/*Solution().fizzBuzz(15).forEach {
    print($0)
}*/

//print(Solution().reverseVowels("Hello"))

/*print(Int.max)

var num = 123456789
for i in 0..<num.description.count {
    print(Solution().reverse(num))
    num /= 10
}*/

print(Solution().selfDividingNumbers(1, 128))

