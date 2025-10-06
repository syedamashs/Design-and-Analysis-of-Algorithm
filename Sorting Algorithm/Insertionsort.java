class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = temp;
        }
        
    }
}
