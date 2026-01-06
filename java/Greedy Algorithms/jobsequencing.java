import java.util.*;

public class jobsequencing{

    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int job[][] = {{4,20},{1,10},{1,40},{1,30}};


        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<job.length;i++){
            jobs.add(new Job(i , job[i][0] , job[i][1]));
        }
        Collections.sort(jobs,(a,b) -> b.profit-a.profit); // descending order 

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max job is "+ seq.size());

        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }



    }
}