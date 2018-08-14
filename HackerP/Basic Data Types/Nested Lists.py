# Nested Lists
# Created by JKChang
# 14/08/2018, 11:33
# Tag:
# Description: https://www.hackerrank.com/challenges/nested-list/problem?h_r=next-challenge&h_v=zen
# Given the names and grades for each student in a Physics class of  students, store them in a nested list and print
#  the name(s) of any student(s) having the second lowest grade.


if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])

    sorted_students = sorted(students, key=lambda x: (x[1], x[0]))
    print(*(x[0] for x in sorted_students[:2]), sep='\n')
