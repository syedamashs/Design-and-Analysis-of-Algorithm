//partition code for Quick Sort !!
partition(arr,lb,ub){

int pivot = arr[lb];
int start = lb;
int end = ub;

while(start < end){
  while(pivot >= arr[start]){
    start++;
  }
  while(pivot < arr[end]){
    end--;
  }

  if(start<end){
    swap(arr[start],arr[end]);
  }

}

swap(arr[end],pivot);
return end;


//Code for Base of QUICK SORT !!!

quicksort(arr,lb,ub){
  if(lb<ub){
    loc=partition(arr,lb,ub);
    quicksort(arr,lb,loc);
    quicksort(arr,loc+1,ub);

  }
}
  
