#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    #
    # Write your code here.
    #
    lastTwoCharOfString = s[-2:]
    firstTwoCharOfString = s[:2]
    # case 12:00:00AM
    if lastTwoCharOfString == "AM" and firstTwoCharOfString == "12":
        # start from s[2] and remove last 2 char
        return "00" + s[2:-2]
    # case 11:00:00AM
    elif lastTwoCharOfString == "AM":
        # remove last 2 char
        return s[:-2]
    # case 00:00:00PM    
    elif lastTwoCharOfString == "PM" and firstTwoCharOfString == "12": 
        # remove last 2 char
        return s[:-2] 
    else: 
        # s[2:8]-start from s[2] to s[7]
        return str(int(firstTwoCharOfString) + 12) + s[2:8]

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    f.write(result + '\n')

    f.close()
