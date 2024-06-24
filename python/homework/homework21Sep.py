# coding: utf-8
import math
import unittest


# 1. Implement an algorithm to check if a given number ​n​ is a ​prime number​.
## Define check function
def isPrime(argNumber):
    print("    ArgNumber is %s" % str(argNumber))
    # 0, 1 is not prime number
    if argNumber < 2: return False
    isPrime = True

    # 1. divide the lower number than argNumber other than 1 :2
    for i in range(2, argNumber):
        # 2. if the any remainders were not 0, it is prime number
        if argNumber % i == 0:
            isPrime = False
            break

    return isPrime


## Test
class TestIsPrime(unittest.TestCase):
    def test(self):
        print("============================================================== isPrime start")
        self.assertEqual(True, isPrime(13))
        self.assertEqual(False, isPrime(1))
        self.assertEqual(True, isPrime(2))
        self.assertEqual(True, isPrime(17))
        self.assertEqual(False, isPrime(100))
        print("============================================================== isPrime   end")


# 2. Implement an algorithm to get the ​LCM(Least Common Multiple)​ of given two numbers ​a​ and ​b.
## Define check function
def findLcm(argNumA=0, argNumB=0):
    print("    ArgNumbers are [%s, %s]" % (argNumA, argNumB))
    smaller = 0
    bigger = 0

    # 0 is not allowed
    if argNumA == 0 or argNumB == 0:
        print("        Invalid argNumbers. Returned 0 because 0 is not allowed")
        return 0
    # find out which is smaller and bigger
    if argNumA < argNumB:
        smaller = argNumA
        bigger = argNumB
    elif argNumA > argNumB:
        bigger = argNumA
        smaller = argNumB
    else:
        return argNumA

    # Check if smaller is the fact of bigger
    if bigger % smaller == 0: return bigger
    # Otherwise, multiply
    return smaller * bigger


## Test
class TestFindLcm(unittest.TestCase):
    def test(self):
        print("============================================================== FindLcm start")
        self.assertEqual(0, findLcm(0, 0))  # Resuilt 0 means error
        self.assertEqual(13, findLcm(1, 13))
        self.assertEqual(6, findLcm(3, 2))
        self.assertEqual(221, findLcm(13, 17))
        self.assertEqual(100, findLcm(10, 100))
        print("============================================================== FindLcm   end")


# 3. Implement an algorithm to get the ​GCD(Greatest Common Divisor)​ of given two numbers ​a​ and ​b​. (Hint: T​ he Euclidean Algorithm​)
## Define check function by myself
def findGcd(argNumA=0, argNumB=0) -> int:
    print("    ArgNumbers are [%s, %s]" % (argNumA, argNumB))
    if argNumA == 0 or argNumB == 0:
        print("        Invalid argNumbers. Returned 0 because 0 is not allowed")
        return 0

    smaller = argNumA if argNumA < argNumB else argNumB
    bigger = argNumA if argNumA > argNumB else argNumB

    smallerFactsSet = set([1, smaller])
    for i in range(2, smaller):
        if smaller % i != 0: continue
        if i not in smallerFactsSet:
            smallerFactsSet.add(i)
            smallerFactsSet.add(smaller // i)
        else:
            break

    biggerFactsSet = set([1, bigger])
    for i in range(bigger - 1, 2, -1):
        if bigger % i != 0: continue
        if i not in biggerFactsSet:
            biggerFactsSet.add(i)
            biggerFactsSet.add(bigger // i)
            if i in smallerFactsSet: break
        else:
            break

    commonDivisorsAry = list(smallerFactsSet & biggerFactsSet)
    commonDivisorsAry.sort()

    print("    smallerFactsSet is " + str(smallerFactsSet))
    print("    biggerFactsSet is " + str(biggerFactsSet))
    print("    commonDivisorsAry is " + str(commonDivisorsAry))

    return commonDivisorsAry[len(commonDivisorsAry) - 1]


## Faster version (refered to Web)
def findGcd2(argNumA=0, argNumB=0) -> int:
    print("  ArgNumbers are [%s, %s]" % (argNumA, argNumB))
    if argNumA == 0 or argNumB == 0:
        print("    Invalid argNumbers. Returned 0 because 0 is not allowed")
        return 0

    remainderNum = 0
    numA = argNumA
    numB = argNumB
    while numA % numB != 0:
        # print("remainderNum is " + str(numA % numB))
        remainderNum = numA % numB
        numA = numB
        numB = remainderNum
    else:
        return numB


## Test
class TestFindGcd(unittest.TestCase):
    def test(self):
        print("============================================================== FindGcd start")
        self.assertEqual(0, findGcd(0, 0))  # Resuilt 0 means error
        self.assertEqual(1, findGcd(1, 13))
        self.assertEqual(1, findGcd(13, 17))
        self.assertEqual(13, findGcd(13, 169))
        self.assertEqual(9, findGcd2(
            123245789230457342980573429085732409857324098573420985734950347598037589032457324908573498057320948573249805734098573049857839407590283423458790234578902345790834597823459873245908273450982345908734590827345908345574839578934023457890324590834759023487523457890324545698034508934908345709345709802923498734250983245980790870987032495890345709382457903485234987349085734908673459034578902345908234750923475342850257777777777777777777777777777777778777777777777777777777777777777777777777777777777777777777777799999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999970985790875439087590423857093579804579238759023857908754390823459083245908342089324598013598031498723987234907123908742319087439807598327903243245567690238409348234098345890234598776523523456235547534524353454556323233457890234579083475980374509832490873245987345098723490587345098723450983758934057342980573498057348905723948057903857324908573249805739804579304857893452304987902348732490857394085789307598013498034125908345239478923045453453543543543534543534253123875348902359867231487612348971234892314907821398472532451354545365375467,
            98935723490853498034598734590873459802345980372459890730485923875682934563045438905701928374590823759803147580931790812938741234789021342347980123790821349812349872348734259087345980341598073415908327459807324587523487523557451324323247652347864387962345897633482937641289376238023842398423049234789634587963453457689234897998938573480993484844848484364789587563189745245786315849))
        self.assertEqual(11, findGcd(8767, 86435349))
        print("============================================================== FindGcd   end")


# 4.(Extra-bonus)​ Implement an algorithm to get the square root of a given number ​n​. (​Hint​)
def findSqrt(argNum=2) -> float:
    print("    ArgNumber is %s" % str(argNum))
    if argNum == 0:
        print("        Invalid argNumbers. Returned 0 because 0 is not allowed")
        return 0.0
    ## Start from half number
    halfDouble = argNum / 2
    mathSqrt = math.sqrt(argNum)

    ## If difference is more than 1, plus or minus
    if mathSqrt - halfDouble > 1:
        # print("        Plus integer " + str(int(mathSqrt - halfDouble)))
        halfDouble += int(mathSqrt - halfDouble)
    if halfDouble - mathSqrt > 1:
        # print("        Minus integer " + str(int(halfDouble - mathSqrt)))
        halfDouble -= int(halfDouble - mathSqrt)

    ## Make as close to sqrt as possible 
    acceptDiff = 0.0001
    changeNum = 0.00001
    while mathSqrt - halfDouble > acceptDiff or halfDouble - mathSqrt > acceptDiff:
        if mathSqrt - halfDouble > acceptDiff: halfDouble += changeNum
        if halfDouble - mathSqrt > acceptDiff: halfDouble -= changeNum
        halfSquare = halfDouble ** 2

    print("        Square root is " + str(halfDouble))
    print("        math.sqrt   is " + str(mathSqrt))
    return halfDouble


## Test
class TestFindSqrt(unittest.TestCase):
    def test(self):
        print("============================================================= FindSqrt start")
        acceptDiffLevel = 3  # accept difference level
        for i in range(0, 21):
            self.assertAlmostEqual(math.sqrt(i), findSqrt(i), acceptDiffLevel)
        print("============================================================= FindSqrt   end")


# Execute Unit Test
unittest.main()
