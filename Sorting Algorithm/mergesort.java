//Base code for MergeSort!!!

mergesort(arr,lb,ub){
  int mid = (lb+ub)/2
  mergesort(arr,lb,mid);
  mergesort(arr,mid+1,ub);
  merge(arr,lb,mid,ub);
}


//Code for Merging !!!

merge(arr,lb,mid,ub){
  i=lb;
  j=mid+1;
  k=lb;

  while(i<=mid && j<=ub){
    if(arr[i]<=arr[j]){
      array[k]=arr[i];
      i++;
      k++;
    }

    else{
      array[k] = arr[j];
      j++;
      k++;
    }

    k++;
  }

  if(i>mid){
    while(j<=ub){
      array[k]= arr[j];
      j++;
      k++;
    }
  }
  else{
    while(i<=mid){
      array[k] = arr[i];
      i++;
      k++;
    }
  }

  for(int k=lb;k<ub;k++){
    arr[k] = array[k];
  }
  

    
