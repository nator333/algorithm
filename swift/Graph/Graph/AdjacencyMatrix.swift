//
//  AdjacencyMatrix.swift
//  SwiftAGDS
//
//  Created by Derrick Park on 2019-03-18.
//  Copyright © 2019 Derrick Park. All rights reserved.
//

//6 8
//1 2
//1 5
//2 3
//2 4
//2 5
//5 4
//4 3
//4 6

import Foundation

func AdjacencyMatrix() -> [[Int]] {
  let firstLine = readLine()!.split(separator: " ")
  let vertices = Int(firstLine[0])! // num of vertices
  let edges = Int(firstLine[1])! // num of edges
  var matrix = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: vertices), count: vertices)
  
  // getting edges
  for _ in 0..<edges {
    let edge = readLine()!.split(separator: " ")
    let u = Int(edge[0])! - 1
    let v = Int(edge[1])! - 1
    matrix[u][v] = 1
    matrix[v][u] = 1
  }

  print("   ", terminator: "")
  for (index, row) in matrix.enumerated() {
    print("\(index + 1)", terminator: "  ")
  }
  print("")
  for (index, row) in matrix.enumerated() {
    print("\(index + 1) \(row)")
  }

  return matrix
}
