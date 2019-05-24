//
//  BFS.swift
//  SwiftAGDS
//
//  Created by Derrick Park on 2019-03-18.
//  Copyright © 2019 Derrick Park. All rights reserved.
//

import Foundation

func bfs(start: Int, check: inout [Bool], adjList: inout [[Int]]) {
  var queue: Queue<Int> = Queue<Int>()
  check[start] = true
  queue.enqueue(start)
  while !queue.isEmpty {
    let first = queue.dequeue()!
    print(first)
    for v in adjList[first] {
      if check[v] == false {
        check[v] = true
        queue.enqueue(v)
      }
    }
  }
}

func StoreInAdjacencyListBFS() {
  let firstLine = readLine()!.split(separator: " ")
  let vertices = Int(firstLine[0])! // num of vertices
  let edges = Int(firstLine[1])! // num of edges
  var adjList = Array<Array<Int>>(repeating: [], count: vertices + 1)

  for _ in 0..<edges {
    let edge = readLine()!.split(separator: " ")
    let left = Int(edge[0])!
    let right = Int(edge[1])!
    adjList[left].append(right) // undirected u -> v, v -> u
    adjList[right].append(left)
  }

  print("   ", terminator: "")
  for index in 0..<adjList.count {
    print("\(index + 1)", terminator: "  ")
  }
  print("")
  for (index, row) in adjList.enumerated() {
    print("\(index + 1) \(row)")
  }

  // BFS (Breadth First Search)
  var visited: [Bool] = Array<Bool>(repeating: false, count: vertices + 1)
  bfs(start: 1, check: &visited, adjList: &adjList)
  
}
