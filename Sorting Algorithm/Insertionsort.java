for i in range(1,n):
  temp=arr[i];
  j=i-1;
  while(j>=0 && arr[j]>arr[i]){
    arr[j+1]=arr[j];
    j--;
  }
  arr[j+1]=temp;
