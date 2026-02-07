public class Startwith{

    static class Node{
        Node child[] = new Node[26];
        boolean EOW = false;
        public Node(){
            for(int i=0;i<26;i++){
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.EOW = true;
    }

    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.EOW;
    }

        
    public static boolean startwith(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(curr.child[idx] == null){
                return false;
            }

            curr = curr.child[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[] = {"i", "like", "sam", "sung", "samsung", "mobile", "ice"};
        for(String w : word){
            insert(w);
        }

        String key = "li";
        System.out.println(startwith(key)); // true

    }
}