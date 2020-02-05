#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    # Write your code here
    # enumerate return index list:(0,seq[0]),(1,seq[1]),(2,seq[2])
    difference = sum(row[i] - row[-i-1] for i, row in enumerate(arr))
    return abs(difference)
    '''
    # Write your code here
    leftDiagonal = 0
    rightDiagonal = 0
    for i, row in enumerate(arr):
        leftDiagonal += row[i]
        rightDiagonal += row[-i-1]

    difference = leftDiagonal - rightDiagonal
    return abs(difference)

    # Write your code here
    prim =0
    sec=0
    length = len(arr[0])
    for count in range(length):
        prim += arr[count][count]
        sec += arr[count][(length-count-1)]
    return abs(prim-sec)
    '''

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
