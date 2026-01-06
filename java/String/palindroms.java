import java.util.*;
public class palindroms{

    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)==str.charAt(n-i-1)){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String str = new String();
        String str = sc.nextLine();
        boolean name = palindrome(str);

        if(name){
            System.out.println("It is not a palindrome");
        }
        else{
            System.err.println("it is a palindrome");
        }
    }
}