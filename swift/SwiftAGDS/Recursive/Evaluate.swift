//
//  Evaluate.swift
//  Recursive
//
//  Created by Masahiro on 2019-03-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Evaluate: NSObject {
    enum CalcOperator : String, CaseIterable {
        case PLUS = "+"
        case MINUS = "-"
        case TIME = "*"
        case DIVIDE = "/"
        
        static func convertFromStr(_ str: String) -> CalcOperator {
            let trimmedStr = str.trimmingCharacters(in: NSCharacterSet.whitespaces)
            for co in CalcOperator.allCases {
                if co.rawValue == trimmedStr {
                    return co
                }
            }
            return .PLUS
        }
        
        func calc(_ left: Int, _ right: Int) -> Int {
            switch self {
            case .PLUS:
                return left + right
            case .MINUS:
                return left - right
            case .TIME:
                return left * right
            case .DIVIDE:
                return left / right
                
            }
        }
    }
    
    static func isDigits(_ str : String) -> Bool {
        return CharacterSet.decimalDigits.isSuperset(of: CharacterSet(charactersIn: str))
    }
    
    static func removeParenthses(_ exp : String) -> String {
        if exp.first! != "(" {
            return exp
        }
        
        var lpCnt = 0
        var rpCnt = 0
        
        var resultIndex : Int = 0
        for (index, charc) in exp.enumerated() {
            if charc == "(" {
                lpCnt += 1
            } else if charc == ")" {
                rpCnt += 1
                if lpCnt == rpCnt {
                    resultIndex = index
                    break
                } else {
                    continue
                }
            }
        }
        let firstIndex = exp.startIndex
        
        return String(exp[exp.index(after: firstIndex)...exp.index(before: exp.index(firstIndex, offsetBy:resultIndex))])
    }
    
    static func findInsideExp(_ exp : String) -> String {
        if isDigits(String(exp[exp.startIndex..<exp.index(exp.startIndex, offsetBy: 1)])) {
            return String(exp[exp.startIndex..<exp.index(exp.startIndex, offsetBy: 1)])
        }
        
        var lpCnt = 0
        var rpCnt = 0
        
        var resultIndex : Int = 0
        for (index, charc) in exp.enumerated() {
            if charc == "(" {
                lpCnt += 1
            } else if charc == ")" {
                rpCnt += 1
                if lpCnt == rpCnt {
                    resultIndex = index
                    break
                } else {
                    continue
                }
            }
        }
        let firstIndex = exp.startIndex
        
        return String(exp[exp.index(after: firstIndex)...exp.index(before: exp.index(firstIndex, offsetBy:resultIndex))])
    }
    
    static func evaluate(_ expStr: String) -> Int {
        if isDigits(expStr) {
            return Int(expStr)!
        }
        
        let parenthesesRemoved = removeParenthses(expStr)
        let insideExp = findInsideExp(parenthesesRemoved)
        let outsideExp = findInsideExp(String(parenthesesRemoved
            .replacingOccurrences(of: "(", with: "&")
            .replacingOccurrences(of: ")", with: "(")
            .replacingOccurrences(of: "&", with: ")")
            .reversed()))
        
        let opeStr : String
        if isDigits(insideExp) {
            // next to inside in parenthesesRemoved is ope
            opeStr = String(parenthesesRemoved[insideExp.endIndex...insideExp.endIndex])
        } else {
            // next next to inside in parenthesesRemoved is ope
            let index = parenthesesRemoved.index(insideExp.endIndex, offsetBy: 2)
            opeStr = String(parenthesesRemoved[index...index])
        }
        
        return CalcOperator.convertFromStr(opeStr).calc(evaluate(insideExp), evaluate(outsideExp))
    }

}
