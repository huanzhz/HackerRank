#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the migratoryBirds function below.
def migratoryBirds(arr):
    two_d_list = []
    most_view_bird = 0
    maxView = 0
    newlist = True

    # first variables
    two_d_list.append([arr[0],1])

    for i in range (1,len(arr)):
        # check type
        # find the index of the value in 2d list
        for j in range (len(two_d_list)):
            if arr[i] == two_d_list[j][0]:          
                # increase count type
                two_d_list[j][1] += 1
                newlist = False
        
        if newlist:
            two_d_list.append([arr[i],1])

        newlist = True

    two_d_list = sorted(two_d_list,key=lambda l:l[0])
    
    for j in range (len(two_d_list)):
        #print (two_d_list)
        if two_d_list[j][1] > maxView:
            maxView = two_d_list[j][1]
            most_view_bird = two_d_list[j][0]

    return most_view_bird

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = migratoryBirds(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
