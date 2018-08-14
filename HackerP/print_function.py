# print_function
# Created by JKChang
# 14/08/2018, 11:01
# Tag:
# Description: https://www.hackerrank.com/challenges/python-print/problem

if __name__ == '__main__':
    n = int(input())
    print(''.join([str(x) for x in range(1, n + 1)]))
    # print(*range(1,int(input())+1),sep='')
