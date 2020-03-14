#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the climbingLeaderboard function below.
def climbingLeaderboard(scores, alice):
    
    # score - 100 90 90 80 75 60
    mylist = sorted(list(set(scores)))
    # mylist - 60 75 80 90 100
    result =[]
    index = 0
    n = len(mylist)
    # n = 5

    # alice - 50 65 77 90 102
    for i in alice:
        while (n > index and i >= mylist[index]):
            index += 1
        # 5 + 1 - 0 for first number 50
        result.append(n+1-index) 

    return result

    ''' time out
    mylist = list(dict.fromkeys(scores))
    result =[]
    rank = 0
    for i in alice:
        rank = 0
        for j in range (len(mylist)):
            rank += 1
            if i > mylist[j]:
                result.append(rank)
                break
            elif i == mylist[j]:
                result.append(rank)
                break
            elif j == len(mylist)-1:
                result.append(rank+1)

    return result
    '''

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    scores_count = int(input())

    scores = list(map(int, input().rstrip().split()))

    alice_count = int(input())

    alice = list(map(int, input().rstrip().split()))

    result = climbingLeaderboard(scores, alice)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
