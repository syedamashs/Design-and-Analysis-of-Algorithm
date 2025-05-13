binarysearch(arr,n,data){
  l=0;
  r=n-1;
  mid=(l+r)/2;

while(l<r){
  if(arr[mid] == data){
    return mid;
  }

  else if(arr[mid]>data){
    r=mid-1;
  }
  else{
    l=mid+1;
  }
  
}
return -1;
}
