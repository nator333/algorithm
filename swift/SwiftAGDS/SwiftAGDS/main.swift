//
//  main.swift
//  SwiftAGDS
//
//  Created by Masahiro on 2019-03-07.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

print("Hello, World!")

var arr = [1, 3, 4, 2, 5]
Sortings.bubbleSort(&arr)
print(arr)

arr = [1, 3, 4, 2, 5]
Sortings.selectionSort(&arr)
print(arr)

arr = [5, 3, 4, 2, 1]
Sortings.insertionSort(&arr)
print(arr)

var left = [5,6,7]
var right = [1, 2, 3]
print(Sortings.merge(left, right))

var part = [10, 3, 5, 4, 1, 0, 9]
Sortings.quickSort(&part, 0, (part.count - 1))
print(part)
//print("pivot = \(pivot), arr= \(part)")
