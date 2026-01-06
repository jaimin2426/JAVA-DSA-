import java.util.Scanner;

public class first{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x,y,z;
        x = y = z = 2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println(x+"-"+y+"-"+z);
    }
}
