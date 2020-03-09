#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    countPair = 0
    ar.sort()
    prev = 0, None
    for curr in ar:
        if prev == curr:
            countPair += 1
            prev = None
        else:
            prev = curr
        
    return countPair

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
