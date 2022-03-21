import com.sun.deploy.security.SelectableSecurityManager;

public class EvenDigitsLeetCode {
    public static void main(String[] args) {
        Solution s = new Solution();
        int num[] = {12, -2456, 2, 6, 7896, 98, 12345};
        System.out.println(s.findNumbers(num));
    }

}
class Solution extends EvenDigitsLeetCode{
    public int findNumbers(int [] nums) {
        int count = 0;
      /*  for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(Math.abs(nums[i]));
            System.out.println(s);
            if (s.length() % 2 == 0)
                count++;

        }*/
        //another way find number digits is calculate using log10
        for(int i : nums){
            int noDigits = (int)Math.log10(Math.abs(i))+1;
            System.out.println(i+" "+Math.log10(i));
            if(noDigits % 2 == 0 )
                count++;
        }
        return count;
    }
}
