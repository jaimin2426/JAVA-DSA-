/* GOOGLE Interview Question
Word Break Problem

Given an input string and a dictionary of words,
find out if the input string can be broken into 
a space-separated sequence of dictionary words.

*/

public class Wordbreak{

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

        
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String prefix = key.substring(0, i);
            String suffix = key.substring(i);

            if(search(prefix) && wordBreak(suffix)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[] = {"i", "like", "sam", "sung", "samsung", "mobile", "ice"};
        for(String w : word){
            insert(w);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key)); // true

    }
}