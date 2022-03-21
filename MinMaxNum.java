public class MinMaxNum {
    public static void main(String[] args) {
        int[] arr = {23, 45 , 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println("Maximum Number: "+maxno(arr));
        System.out.println("Minimum Number: "+minno(arr));
    }
    static int maxno(int[] arr){
        int max = Integer.MIN_VALUE;;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i])
                max=arr[i];
        }
        return max;
    }
    static int minno(int[] arr){
        int min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
