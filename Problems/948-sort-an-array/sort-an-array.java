class Solution {
   private void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    private void heapify(int[] arr, int n, int i) {
        int large = i; 
        int left = 2 * i + 1;
        int right = 2 * i + 2; 
        if (left < n && arr[left] > arr[large]) {
            large = left;
        }
        if (right < n && arr[right] > arr[large]) {
            large = right;
        }
        if (large != i) {
            swap(arr, i, large); 
            heapify(arr, n, large);
        }
    }

    private void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }
}
  
    /*public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=0;
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}*/