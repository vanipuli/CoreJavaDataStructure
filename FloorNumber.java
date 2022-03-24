package com.company;

public class FloorNumber {
    public static void main(String[] args) {
        int arr[] =  {2, 4 ,5, 10, 12, 14, 36, 45};
        int target = 2;
        //find greatest number from list element which are less than target number
        /* foreg. target = 13 ,
        * output : 12*/
        System.out.println(findFloorNumber(arr,target));
    }
    static int findFloorNumber(int[] arr, int target){
        int strtIdx =0, endIdx = arr.length - 1, m=0;
        if(target < arr[0])
            return -1;
        while(strtIdx <= endIdx){
            m = strtIdx + (endIdx - strtIdx)/2;
            if(target == arr[m])
                return arr[m];
            if(target >= arr[m]){
                strtIdx = m+1;
            }
            else{
                endIdx = m-1;
            }

        }
        return arr[endIdx];
    }
}
