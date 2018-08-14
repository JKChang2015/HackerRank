# test
# Created by JKChang
# 14/08/2018, 14:55
# Tag:
# Description: 

# !/bin/python3


if __name__ == '__main__':
    N = int(input())
    d = {}
    for _ in range(N):
        name, number = input().split()
        d[name] = number

    for _ in range(N):
        name = input()
        if name in d:
            print("{}={}".format(name, d[name]))
        else:
            print("Not found")
