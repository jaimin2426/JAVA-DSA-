import java.util.Scanner;
public class first{

    public static boolean search(int a[][],int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==key){
                    System.err.println("Element found at index ("+i+","+j+")");
                    return true;                
                }
            }
        }
        System.err.println("Element not found");
        return false;
    }
    public static void main(String args[]){
        int a[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter what you want to find? ");
        int key = sc.nextInt();

        search(a, key);


    }
}