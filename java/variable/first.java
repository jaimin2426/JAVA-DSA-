import java.util.Scanner;
public class first{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // float c = a*b;
        // System.out.println(c);

        // char name = 'j';
        // System.out.println(name);

        // boolean var = true;
        // System.err.println(var);

        // float rad = sc.nextFloat();
        // float area = 3.14f*rad*rad;
        // System.out.println("Area of circule = "+area);

        // float a = 2.5941684f;
        // System.out.println(a);
        // int b = (int) a;
        // System.out.println(b);

        // char c = 'k';
        // System.out.print(c);
        // int d  = (int)c;
        // System.out.println(d);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // float avg = (a+b+c)/3.0f;
        // System.out.println(avg);

        // int a = sc.nextInt();

        // System.out.println(a*a);

        System.out.println("Enter pen , pencil, and rubber price (Ex- 5 6 8) = ");
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int rubber = sc.nextInt();
        System.out.println("--------------------");
        System.out.println("pen price is = "+pen);
        System.out.println("pencil price is = "+pencil);
        System.out.println("rubber price is = "+rubber);
        System.out.println("--------------------");
        System.out.println("Total amount = "+(pen+pencil+rubber));
    }
}