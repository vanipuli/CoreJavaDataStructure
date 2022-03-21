import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 45 , 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -3;
        System.out.println("Enter start & and End Index: ");
        int strtIdx = sc.nextInt();
        int endIdx = sc.nextInt();
        System.out.println(linearRangeSearch(arr, strtIdx,endIdx,target));
    }
    static int linearRangeSearch(int[] arr, int strtIdx, int endIdx,int target){
        if(endIdx == arr.length || strtIdx <0 || strtIdx >= arr.length || strtIdx > endIdx)
            return -1;

        for(int i=strtIdx ; i <=endIdx; i++){
            if(arr[i]== target)
                return 1;
        }
        return -1;
    }
}
