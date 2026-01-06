//pair with n friends either single or double. find out the total numbers of way 

class pairing{

    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        return pair(n-1)+(n-1)*pair(n-2);// n-1 = pair choice // pair(n-2) = 1 pair ways
    }
    public static void main(String args[]){
        System.out.println(pair(3));
    }
} 