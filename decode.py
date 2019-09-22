
str1 = "2[a2[b]]"
mystk = []
i = 0
res = ""
while i < len(str1):
    print("i:",i)
    if str1[i] >= '0' and str1[i] <= '9':
        counter = 0
        while str1[i] >= '0' and str1[i] <= '9':
            counter = counter*10 + (ord(str1[i]) - ord('0'))
            i += 1
        print("reducing i from {} to {}".format(i, i - 1))
        i = i-1
        mystk.append(counter)
        print("Now stack is",mystk)
    elif str1[i] == ']':
        print("inside",i)
        temp = ""
        res = ""
        x = mystk.pop()
        while x != '[':
            print("popped element",x)
            temp = x + temp
            print("Now stack is", mystk)
            x = mystk.pop()
            print("popped element",x)
        count = mystk.pop()
        print("count",count)
        for j in range(count):
            res += temp
        print("res",res)
        mystk.append(res)
        print("Now stack is", mystk)
    else:
        mystk.append(str1[i])
        print("Now stack is", mystk)
    print("increasing i from {} to {}".format(i,i+1))
    i += 1
sol = ""
for i in range(len(mystk)):
    sol = sol+mystk[i]
print("The final answer is :",sol)
