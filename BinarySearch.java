package com.company;

public class BinarySearch {
// Return the index of target number
    public static void main(String[] args) {
	    FindElement f = new FindElement();
        int arr[] = {2, 4 ,5, 10, 12, 14, 36, 45};
        //int arr[] = {97,76,65,54,43,32,21,10,9,5,4,2,1};
        int target = 45;
        System.out.println(f.binarySearch(arr , target));
    }
}
class FindElement extends BinarySearch{
    public int binarySearch(int [] arr, int target){
        int strtIdx = 0, endIdx = arr.length-1;
        int mid;
        // int mid = strtIdx+endIdx/2;

    //    int count=0;
        if(target > arr[arr.length-1] || target < arr[0])
            return -1;
        while(strtIdx <= endIdx){
           // count++;
             mid = strtIdx+ (endIdx - strtIdx)/2;
            if(target == arr[mid])
                return mid;
            if(target <= arr[mid])
                endIdx = mid - 1;
            else
                strtIdx = strtIdx + 1;


        }
        return -1;
    }
}