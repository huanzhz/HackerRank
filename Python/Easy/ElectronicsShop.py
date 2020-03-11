#!/bin/python3

import os
import sys

#
# Complete the getMoneySpent function below.
#
def getMoneySpent(keyboards, drives, b):
    temparraylist = []
    totalprice = 0

    for i in range(len(keyboards)):
        for j in range(len(drives)):
            totalprice = keyboards[i] + drives [j]
            if (b - totalprice) >= 0:
                temparraylist.append(totalprice)
                continue
        
    if temparraylist == []:
        return -1
    else:
        temparraylist.sort()    # can check for max in loop rather than this sort
        return temparraylist[-1]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    bnm = input().split()

    b = int(bnm[0])

    n = int(bnm[1])

    m = int(bnm[2])

    keyboards = list(map(int, input().rstrip().split()))

    drives = list(map(int, input().rstrip().split()))

    #
    # The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
    #

    moneySpent = getMoneySpent(keyboards, drives, b)

    fptr.write(str(moneySpent) + '\n')

    fptr.close()
