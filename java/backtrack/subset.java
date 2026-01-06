public class subset{

    public static void subset(String str,String ans, int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("{NULL}");
            }else{
                System.out.println("{"+ans+"}");
            }
            
            return;
        }
        // recursion
        // yes
        subset(str, ans+str.charAt(i), i+1);
        // No
        subset(str, ans, i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        subset(str, "", 0);
    }
}