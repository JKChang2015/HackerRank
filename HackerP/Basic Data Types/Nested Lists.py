# Nested Lists
# Created by JKChang
# 14/08/2018, 11:33
# Tag:
# Description: https://www.hackerrank.com/challenges/nested-list/problem?h_r=next-challenge&h_v=zen
# Given the names and grades for each student in a Physics class of  students, store them in a nested list and print
#  the name(s) of any student(s) having the second lowest grade.


if __name__ == '__main__':
    n = int(input())
    students = sorted([[input(), float(input())] for _ in range(n)], key=lambda x: x[0])
    scores = sorted(list(set([x[1] for x in students])))
    print(*[x[0] for x in students if x[1] == scores[1]], sep='\n')
