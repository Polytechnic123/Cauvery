def lsearch(l):
    key=int(input("Enter the item"))
    flag=0
    for i in range(0,len(l)):
        if l[i]==key:
            p=i
            flag=1

    if flag==1:
        print("%d is present at l[%d]"%(key,p))
    else:
        print("%d is not present"%key)


l=[10,20,30,40,50]
print("the list is",l)
lsearch(l)
            
