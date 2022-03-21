public class RichCustWealthLeetCode2 {
    public static void main(String[] args) {
        int account[][] = {
                {1,5},
                {7,3},
                {3,5}
        };
        RichCustomer r = new RichCustomer();

        System.out.println(r.maximumWealth(account));
    }
}
 class RichCustomer extends RichCustWealthLeetCode2{
    public int maximumWealth(int[][] accounts){
        int sum=0;int max = Integer.MIN_VALUE;
        for(int[] custAct : accounts){
            sum=0;
            for(int amount : custAct){
                sum+=amount;
            }
            System.out.println("sum: "+sum+" :max: "+max);
            if(max<sum)
                max=sum;
        }
        return max;
    }
}
