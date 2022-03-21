import java.util.Scanner;

public class StringLinearSearch {
    //Search char in string given
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name & char to found:");
        String name = sc.nextLine();
        char element = sc.next().trim().charAt(0);
        System.out.println(findchar(name,element));
    }
    static boolean findchar(String name, char element){
        if(name == null)
            return false;

      /*  for(int i=0; i< name.length(); i++){
            if(name.charAt(i) == element)
                return true;
        }*/
        for(char ch : name.toCharArray()){
            if(ch == element)
                return true;
        }
        return false;
    }
}
