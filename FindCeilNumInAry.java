package com.company;

public class FindCeilNumInAry {
    public static void main(String[] args) {
        int arr[] =  {2, 4 ,5, 10, 12, 14, 36, 45};
        int target = 1;
        System.out.println(findCeilNo(arr,target));
    }
    static int findCeilNo(int[] arr, int target) {
        //To find smallest number of List of element who are greater than target given number
        int strtIdx = 0, endIdx = arr.length-1;
        int mid;
        if(target > arr[arr.length-1])
            return -1;

        while(strtIdx <= endIdx){
            mid = strtIdx+ (endIdx - strtIdx)/2;
            if(target == arr[mid])
                return arr[mid];

            if(target <= arr[mid]) {
                endIdx = mid - 1;
            }
            else {
                strtIdx = strtIdx + 1;
            }
        }
        return arr[strtIdx];
    }

}