
import java.util.*;

public class indiancoins {

    public static void main(String args[]) {
        Integer INR[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        Arrays.sort(INR, Comparator.reverseOrder());

        int count = 0;
        int amount = 300000;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<INR.length;i++){
            if (INR[i] <= amount) {
                while (INR[i] <= amount) {
                    count++;
                    ans.add(INR[i]);
                    amount -= INR[i];
                }
            }
        }

        System.out.println("Total minimum coin is "+ count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) +" ");
        }

    }
}
