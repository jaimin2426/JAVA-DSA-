public class largeststring{
    public static void main(String args[]){
        // String str[] = {"apple","mango","banana"};

        // String largest = str[0];
        // for(int i=1;i<str.length;i++){
        //     if(largest.compareTo(str[i])<0){
        //         largest = str[i];
        //     }
        // }
        // System.out.println(largest);

        StringBuilder sb = new StringBuilder("");

        for(char ch = 'A';ch<='Z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}