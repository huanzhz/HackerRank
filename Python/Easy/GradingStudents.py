#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#

def gradingStudents(grades):
    # Write your code here
    numModuleBy5 = 0
    remainderOfMod5 = 0
    for i in range(len(grades)):
        # 40 - 37 = 3 which will not modified hence it fail grade boundry
        if grades[i] > 37:
            numModuleBy5 = grades[i] % 5
            if(numModuleBy5 != 0):
                remainderOfMod5 = 5 - numModuleBy5
                if remainderOfMod5 < 3 :
                    grades[i] += remainderOfMod5

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    grades_count = int(input().strip())

    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = gradingStudents(grades)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
