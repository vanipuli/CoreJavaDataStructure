public class LeetCode304BinarySearch {
    public static void main(String[] args) {
      //  int nums[] = {-1,0,3,5,9,12} ; int target = 2; // expected output : 4
      //  int [] nums = {5};  int target = 5; // expected output : 0
       int [] nums = {2, 5};  int target = 5; // expected oput: 1
        System.out.println(findElement(nums,target));
    }
    static int findElement(int[] nums, int target){
        int start = 0, end = nums.length -1;int mid =0;
        if(end == 0) {
            if(nums[end]== target)
                return 0;
        }
        while(start <= end){
            mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start = mid +1;
            }
            else {
                end = mid -1 ;
            }
        }
        return -1;
    }
}
