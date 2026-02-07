public class LongestWordWithAllPrefixes{
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
    public static String ans = "";

    public static void longestword(Node root, StringBuilder str){
        if(root == null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.child[i] != null && root.child[i].EW == true){
                char ch = (char)(i+'a');
                str.append(ch);
                if(str.length() > ans.length()){
                    ans = str.toString();
                }
                longestword(root.child[i], str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String word[] = {"a", "banana", "app", "appl", "apple", "apply", "b" ,"ba", "ban", "bana", "banan", "banana"};

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        longestword(root,new StringBuilder(""));
        System.out.println(ans);
    }
}