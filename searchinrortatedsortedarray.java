public class searchinrotatedsortedarray {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+end/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
              if(arr[start]<target && arr[mid]>target)
              {
                end=mid-1;
              }
              else start=mid+1;
            }
            if(arr[mid]<=arr[end])
            {
                if(arr[mid]<target && arr[end]>target)
                {
                    start=mid+1;
                }
                else 
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}