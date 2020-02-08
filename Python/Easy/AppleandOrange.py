#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countApplesAndOranges function below.
def countApplesAndOranges(s, t, a, b, apples, oranges):
    appleWithinRange = 0
    orangeWithinRange = 0
    value = 0
    # amount of apple drops
    for appleDropsDistance in apples:
        value = appleDropsDistance + a
        # check if value between s and t
        if value >= s and value <= t:
            appleWithinRange += 1

    for orangeDropsDistance in oranges:
        value = orangeDropsDistance + b
        # check if value between s and t
        if value >= s and value <= t:
            orangeWithinRange += 1

    print (appleWithinRange)
    print (orangeWithinRange)

if __name__ == '__main__':
    st = input().split()

    s = int(st[0])

    t = int(st[1])

    ab = input().split()

    a = int(ab[0])

    b = int(ab[1])

    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    apples = list(map(int, input().rstrip().split()))

    oranges = list(map(int, input().rstrip().split()))

    countApplesAndOranges(s, t, a, b, apples, oranges)
