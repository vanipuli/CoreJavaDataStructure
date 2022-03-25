package com.company;

import java.util.Arrays;

public class FindFirstLastLeetCode2 {
    public static void main(String[] args) {
    int[] nums =  {5,7,7,7,7,7,8,8,10};   int target = 7;  //expected o/p: [3,4]
     //   int[] nums =  { 1 } ; int target =1;  // expected outpu [0,0]
    //   int[] nums =  { 2,2}; int target = 2; // expected o/p: [0,1]
     //  int[] nums = { }; int target = 0; //expected [-1,-1]
     //   int[] nums =  {5,7,7,8,8,10};   int target = 6;  //expected o/p: [-1,-1]
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[]  searchRange(int[]nums, int target){
        int[] value = {-1,-1};
        value[0] = findStrtEndVal(nums,target,true);
        value[1] = findStrtEndVal(nums,target,false);
        return value;
       // int strtIdx=0, endIdx =nums.length-1, m=0;
       /* while(strtIdx <= endIdx){
            m = strtIdx + (endIdx-strtIdx)/2;
            if(target == nums[m]){
                if(value[0] >= m)
                    value[0]=m;
            }
            if(target > nums[m]){
                strtIdx = m+1;
            }
            else{
                endIdx = m-1;
            }
        }*/
        /*Binary Search Algorithm*/
      /*  while(strtIdx <= endIdx){
            m = strtIdx + (endIdx-strtIdx/2);

            if(target < nums[m]){
                endIdx = m - 1;
            }else if(target > nums[m]){
                strtIdx = m + 1;
            }else{
                if(value[0] < m)
                   value[0]=m;
            }
        }

        strtIdx=0; endIdx =nums.length-1; m=0;
        while(strtIdx <= endIdx){
            m = strtIdx + (endIdx-strtIdx)/2;
           if(target < nums[m]){
               endIdx = m - 1;
           }else if(target > nums[m]){
               strtIdx = m + 1;
           }
           else{
               if(value[1] < m)
                 value[1]=m;
           }
        }
        return value;*/
    }
    static int findStrtEndVal(int[] nums, int target, boolean findStrtIdx){
        int idxValue = -1;
        int strtIdx = 0, endIdx = nums.length -1,  m=0;

        while(strtIdx <= endIdx){
            m = strtIdx + (endIdx - strtIdx)/2;
            if(target > nums[m]){
                strtIdx = m + 1;
            }else if(target < nums[m]){
                endIdx = m - 1;
            }else{
                //potential ans found
                idxValue = m;
                if(findStrtIdx){
                    endIdx = m - 1;
                }else{
                    strtIdx = m + 1;
                }
            }
        }
        return idxValue;
    }
}
