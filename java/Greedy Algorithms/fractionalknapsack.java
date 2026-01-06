import java.util.*;

public class fractionalknapsack{
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capa = w;
        int finalv = 0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capa >= weight[idx]){
                finalv += val[idx];
                capa -= weight[idx];
            }else{
                finalv += (ratio[i][1]*capa);
                capa =  0;
                break;
            }
        }

        System.out.println(finalv);
    }
}