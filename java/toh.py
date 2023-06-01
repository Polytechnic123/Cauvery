def toh(n,a,b,c):
    if(n==1):
        print("Move disk from Source {} to destination {}".format(a,c))
        return
    toh(n-1,a,c,b)
    print("Move disk {} from source {} to destination {}".format(n,a,c))
    toh(n-1,b,a,c)

n=int(input("Enter the value"))
toh(n,"a","b","c")
