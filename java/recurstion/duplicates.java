public class duplicates {

    public static void duplicateremove(String str, int idx, StringBuilder arr, boolean[] map) {
        // Base case
        if (idx == str.length()) {
            System.out.println(arr);
            return;
        }

        char curr = str.charAt(idx);

        if (map[curr - 'a']) {
            // Character already seen — skip it
            duplicateremove(str, idx + 1, arr, map);
        } else {
            // Mark character and add it
            map[curr - 'a'] = true;
            duplicateremove(str, idx + 1, new StringBuilder(arr).append(curr), map);
        }
    }

    public static void main(String args[]) {
        String str = "jaiminpatel";
        duplicateremove(str, 0, new StringBuilder(), new boolean[26]);
    }
}
