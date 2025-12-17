public class b_findSubsets {

    // Recursive method to print all subsets
    public static void subsets(String str, int i, String ans) {
        // Base case: if we have reached the end of the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // empty subset
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Include current character
        subsets(str, i + 1, ans + str.charAt(i));
        // include abc i=3 =str.length() print ans return
        // exclude ab i=2+1=str.length() print ab return
        //
        // Exclude current character
        subsets(str, i + 1, ans);
    }

    /*
     * ""
     * (start)
     * / \
     * take 'a' skip 'a'
     * "a" i=1 ""
     * / \ / \
     * take 'b'i=2 skip 'b' take 'b' skip 'b'
     * "ab" "a" "b" ""
     * / \ / \ / \ / \
     * take ci=3 skip ci=3 take c skip c take c skip c take c skip c
     * "abc" "ab" "ac" "a" "bc" "b" "c" ""
     */
    public static void main(String args[]) {
        String str = "abc";
        subsets(str, 0, ""); // start recursion from index 0
    }
}