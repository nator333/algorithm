# coding: utf-8
def probAntCollisionFromVertexNum(vertex=3) -> str:
    if vertex < 3: return "error"
    # calculate number of combinations
    ## (0, 0, 0), (0, 0, 1), (0, 1, 0), (0, 1, 1), (1, 0, 0), (1, 0, 1), (1, 1, 0), (1, 1, 1)
    combinationNum = 2 ** vertex
    # Safe case is only (0, 0, 0), (1, 1, 1)
    safeCaseNum = 2
    # All cases - safe cases = collision case
    collisionCaseNum = combinationNum - safeCaseNum
    # Reduction by 2
    combinationNum /= 2
    collisionCaseNum /= 2
    # Return fraction
    return str(int(collisionCaseNum)) + "/" + str(int(combinationNum))


for i in range(3, 10):
    print(probAntCollisionFromVertexNum(i))

# Output
## 3/4
## 7/8
## 15/16
## 31/32
## 63/64
## 127/128
## 255/256
