//Just an pseudoCode or Algorithm!!!!

for i in range(0,n-1):
  int flag=0
  for j in range(0,n-1-i):
    if(arr[j]>arr[j+1]):
      temp=arr[j]
      arr[j]=arr[j+1]
      arr[j+1]=arr[j]
      flag=1

 if flag==0:
    return


  
  
