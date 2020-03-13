#!/bin/python3
import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    # Write your code here
    a.sort()
    count = 0
    maxvalue = []
    for i in range (len(a)):
        for j in range (len(a)):
            if (a[i] - a[j]) == 1 or (a[i] - a[j]) == 0:
                count+=1

        maxvalue.append(count)
        count = 0

    return max(maxvalue)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
