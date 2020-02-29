#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the bonAppetit function below.
def bonAppetit(bill, k, b):
    chargedValue = 0

    for i in range (len(bill)):
        if i == k:
            continue
        chargedValue += bill[i]

    chargedValue /= 2

    if b > chargedValue:
        overChargedValue = int(b - chargedValue)
        print (overChargedValue)
    else:
        print ("Bon Appetit")

if __name__ == '__main__':
    nk = input().rstrip().split()

    n = int(nk[0])

    k = int(nk[1])

    bill = list(map(int, input().rstrip().split()))

    b = int(input().strip())

    bonAppetit(bill, k, b)
