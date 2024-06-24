//
//  main.swift
//  Recursive
//
//  Created by Masahiro on 2019-03-08.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

print("Hello, World!")


func isPalindrome(_ word: String) -> Bool {
    // base base
    if (word.count <= 1) {
        return true
    }
    // recursive case
    if let first = word.first, let last = word.last, first == last {
        let nextStart = word.index(word.startIndex, offsetBy: 1)
        let nextEnd = word.index(word.endIndex, offsetBy: -1)
        return isPalindrome(String(word[nextStart..<nextEnd]))
    }
    return false
    
}


func printBinary(_ num: Int, _ original: Int = 0) {
    if (num < 0) {
        print("-", terminator:"")
        printBinary(-num, original)
        if (num == original) {
            print("")
        }
        return
    }
    if num <= 1 {
        print(num, terminator: "")
        return
    }
    printBinary(num / 2, original)
    print(num % 2, terminator: "")
    if (num == original) {
        print("")
    }
}

printBinary(16, 16)
printBinary(-16, 16)

func reverseLines() {
    let contnts = try! String (contentsOfFile: FileManager.default.currentDirectoryPath + "/Recursive/File.txt", encoding: .utf8)
    let lines = contnts.split(separator: "\n")
    print(lines)
}

//reverseLines()

//func printBinary2(_ bit:Int) {
//    print("0", separator: "")
//    print("1", separator: "")
 //   if bit > 0 {
  //      printBinary(bit - 1)
   // } else {
    //
    //}

//}

// printBinary2(1)

func printDecimal(_ digits: Int, _ prefix: String = "") {
    if digits == 0 {
        print(prefix)
    } else {
        for i in 0..<10 {
            printDecimal(digits - 1, prefix + String(i))
        }
    }
}

printDecimal(2)

func permutaions(_ word: String, _ sofar : String) {
    if (word.count == 0) {
        //print(rest)
    } else {
        
    }
}

print("==========================")
print(Evaluate.evaluate("((0+1)+(2+3))")) // 6
print(Evaluate.evaluate("((0+1)+3)"))  // 4
print(Evaluate.evaluate("7"))                 // 7
print(Evaluate.evaluate("(2+2)"))             // 4
print(Evaluate.evaluate("(1+(2*4))"))         // 9
print(Evaluate.evaluate("((1+3)+((1+2)*5))")) // 19
