public class Trie{
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
    public static void main(String[] args) {
        String word[] = {"the", "a", "there", "answer", "any", "three", "bye", "their"};

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        System.out.println(search("the")); // true
        System.out.println(search("these")); // false
        System.out.println(search("bye")); // true
    }
}