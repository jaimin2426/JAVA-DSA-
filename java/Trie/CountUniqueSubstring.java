/* Google / Microsoft
Given a string of length n of lowercase alphabet characters, 
we need to count otal number of distinct substring of this string.
*/

public class CountUniqueSubstring{
    static class Node{
        Node child[] = new Node[26];
        boolean EW = false;
        Node(){
            for(int i=0;i<26;i++){
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){ // O(L) where L is the length of the word
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.EW = true;
    }

    public static boolean search(String key){ // O(L) where L is the length of the word
        Node curr = root;
        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.EW == true;

    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.child[i] != null){
                count += count(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s = "jaimin";

        // suffix

        for(int i=0;i<s.length();i++){
            String suffix = s.substring(i);
            insert(suffix);
        }
        System.out.println(count(root));
    }
}