import java.util.*;

public class minabsoultediffpairs{
    public static void main(String args[]){
        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int ans = 0;
        for(int i=0;i<a.length;i++){
            ans+=Math.abs(a[i]-b[i]);
        }

        System.out.println(ans);
    }
}