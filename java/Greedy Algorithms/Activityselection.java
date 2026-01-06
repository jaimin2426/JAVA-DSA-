import java.util.*;

public class Activityselection{
    public static void main(String args[]){
        int start[] = {3,1,0,5,8,5};
        int end[] = {4,2,6,7,9,9};

        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lambda function 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxact =1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];
        for(int i=0;i<start.length;i++){
            if(activities[i][1] >= lastend){
                maxact++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }

        System.err.println("Max activity = "+ maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
    }
}