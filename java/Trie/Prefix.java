/*Google / Microsoft

Tc: O(n*k) where n is number of words and k is average length of words
Sc: O(n*k)
*/
public class Prefix {

    static class Node {

        Node child[] = new Node[26];
        boolean EOW = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String w) {
        Node curr = root;
        for (int i = 0; i < w.length(); i++) {
            int idx = w.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            } else {
                curr.child[idx].freq++;
            }
            curr = curr.child[idx];
        }
        curr.EOW = true;
    }

    public static void prefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.child.length;i++){
            if(root.child[i]!=null){
                prefix(root.child[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String args[]) {
        String arr[] = {"zebra", "dog", "dove", "duck", "done"};
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq = -1;
        prefix(root,"");

    }
}
