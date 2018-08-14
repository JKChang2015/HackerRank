# Find the Runner-Up Score!
# Created by JKChang
# 14/08/2018, 11:22
# Tag:
# Description: https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem?h_r=next-challenge&h_v=zen

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))

    z = max(arr)
    while max(arr) == z:
        arr.remove(max(arr))

    print(max(arr))
