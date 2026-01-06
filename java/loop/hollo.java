public class hollo{

    public static void invertedpiramead(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedhalfnumberpirameade(int a){
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds(int a){
        int c = 1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }

    public static void oneandzero(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                // i % 2 != 0 && j % 2 != 0||i % 2 == 0 && j % 2 == 0||i==j
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(a-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(a-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(a-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=a;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(a-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String args[]){
        int a = 6;
        // int b = 9;

        // for(int i=0;i<=a;i++){
        //     for(int j=0;j<=b;j++){
        //         if(i==0||j==0||i==a||j==a){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // invertedpiramead(a);
        // invertedhalfnumberpirameade(a);
        // floyds(a);  
        // oneandzero(a);      
        butterfly(a);
    }
}