import java.util.Arrays;

public class SerachIn2Dary {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, -56},
            {18,12}
        };
        int target = 34;

        System.out.println(Arrays.toString(search2D(arr,target)));
        System.out.println("Maximum Number: "+search2DMax(arr,target));
        System.out.println("Minimum Number: "+search2DMin(arr,target));
    }
    static int[] search2D(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
    static int search2DMax(int[][] arr, int target){
        int max = Integer.MIN_VALUE;
        for(int[] rows : arr){
            for(int element : rows){
                if(element > max)
                    max=element;
            }
        }
        return  max;
    }
    static int search2DMin(int[][] arr, int target){
        int min = arr[0][0];
        for(int[] rows: arr){
            for(int value: rows){
                if(value < min)
                    min=value;
            }
        }
        return  min;
    }
}
