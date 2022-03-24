package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //  int arr[] = {-50,1,2,4,5,9,10,21,32,43,54,65,76,97};
        int arr[] = {97,76,65,54,43,32,21,10,9,5,4,2,1,-50};
        int target = 43;
        System.out.println(orderBinsearch(arr,target));
    }
    static int orderBinsearch(int[] arr, int target){
        boolean desc_order = arr[0] > arr[arr.length - 1];
        int value=0;

        if(desc_order){
             value = findElementInDescArray(arr,target);
        }
        else{
             value = findElementInAscArray(arr,target);
        }
        return value;
    }
    static int findElementInDescArray(int[] arr, int target){
       int strtIdx = 0, endIdx = arr.length -1;
       int mid = 0;
        while(strtIdx <= endIdx){
            mid = strtIdx + (endIdx - strtIdx)/2;
            if(arr[mid] == target)
                return mid;
            if(target >= arr[mid])
                endIdx = mid -1;
            else
                strtIdx = mid+1;
        }
        return -1;
    }
    static int findElementInAscArray(int[] arr, int target){
        int strtIdx = 0, endIdx = arr.length -1;
        int mid = 0;
        while(strtIdx <= endIdx){
            mid = strtIdx + (endIdx - strtIdx)/2;
            if(arr[mid] == target)
                return mid;
            //target = 43 {-50,1,2,4,5,9,10,21,32,43,54,65,76,97};
            if(target <= arr[mid])
                endIdx = mid - 1;
            else
                strtIdx = mid + 1;
        }
        return -1;
    }
}
