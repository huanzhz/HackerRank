#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'getTotalX' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#

# https://www.youtube.com/watch?v=40kpc90ZzDg
# https://www.mathblog.dk/hackerrank-between-two-sets-in-python/
# https://www.geeksforgeeks.org/gcd-in-python/
# https://www.geeksforgeeks.org/program-to-find-lcm-of-two-numbers/

def getTotalX(a, b):
    # Write your code here
    # lcm = Least Common Multiplier
    # gcd = Greatest Common Divisor

    # The greatest common divisor tells us what the biggest number x 
    # a factor of a and b such that a mod x = 0 and b mod x = 0.

    lcm_num = a[0]
    gcd_num = b[0]

    # find the Least Common Multiplier
    if len(a) > 1:
        for x in range(1,len(a)):
            lcm_num =  lcm(lcm_num, a[x])
    
    # find the Greatest Common Divisor or call Highest Common Factor(HCF)
    if len(b) > 1:
        for x in range(1,len(b)):
            gcd_num = gcd(gcd_num,b[x])

    count = 0
    # range(start, stop, step)
    # x = lcm_num at starting
    # TypeError: 'float' object cannot be interpreted as an integer -> add int()
    # +1 to get the last gcd_num to check before exit
    for x in range(lcm_num, int(gcd_num)+1, lcm_num):
        if gcd(x, gcd_num) == x:
            count += 1
    return count

def gcd(a,b):
    while a % b != 0:
        a, b = b, (a % b)
    return b

def lcm(a, b):
    return a * b // gcd(a, b)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    brr = list(map(int, input().rstrip().split()))

    total = getTotalX(arr, brr)

    fptr.write(str(total) + '\n')

    fptr.close()
