/*We are given a bar of chocolate composed of m × n square pieces. 
One should break the chocolate into single squares. 
Each break of a part of the chocolate is charged a cost expressed by a positive integer. 
This cost does not depend on the size of the part that is being broken but only depends 
on the line the break goes along. 
Let us denote the costs of breaking along consecutive vertical 
lines with x₁, x₂, …, xₘ₋₁ and along horizontal lines with y₁, y₂, …, yₙ₋₁.

Compute the minimal cost of breaking the whole chocolate into single squares.
*/

import java.util.*;
public class chocola{
    public static void main(String args[]){
        int n = 4, m = 6;
        Integer ver[] = {2,1,3,1,4}; //m-1
        Integer hor[] = {4,1,2}; // n-1

        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());

        int h = 0, v = 0, hp = 1, vp = 1;
        int finalc = 0;
        while(h < hor.length && v < ver.length){
            if(ver[v] <= hor[h]){ //horizontal cut if first , because it's cost is high
                finalc += (hor[h] * vp);
                hp++;
                h++;
            }else{
                finalc += (ver[v] * hp);
                vp++;
                v++;
            }
        }

        while(h < hor.length){
            finalc += (hor[h] * vp);
            hp++;
            h++;
        }
        while(v < ver.length){
            finalc += (ver[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Min Cost of cuts = "+ finalc);

    }
}