# Lists
# Created by JKChang
# 14/08/2018, 14:17
# Tag:
# Description: 

if __name__ == '__main__':
    cmd_count = int(input())
    l = []

    for _ in range(cmd_count):
        s = input().split()
        cmd = s[0]
        args = s[1:]
        if cmd != 'print':
            cmd += "(" + ",".join(args) + ")"
            eval('l.' + cmd)
        else:
            print(l)
