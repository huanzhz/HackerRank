#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the catAndMouse function below.
def catAndMouse(x, y, z):
    distance_catA_mouseC = abs(x-z)
    distance_catB_mouseC = abs(y-z)

    if distance_catB_mouseC < distance_catA_mouseC:
        return "Cat B"
    elif distance_catB_mouseC == distance_catA_mouseC:
        return "Mouse C"
    else:
        return "Cat A"
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        xyz = input().split()

        x = int(xyz[0])

        y = int(xyz[1])

        z = int(xyz[2])

        result = catAndMouse(x, y, z)

        fptr.write(result + '\n')

    fptr.close()
