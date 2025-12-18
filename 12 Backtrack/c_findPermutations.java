public class c_findPermutations {

    public static void permutations(String str, String ans) {
        // Base case: if the string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Choose the current character
            char curr = str.charAt(i);
            // Form the remaining string after removing the chosen character
            String newstr = str.substring(0, i) + str.substring(i + 1);
            // Recur with the remaining string and the accumulated answer
            permutations(newstr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        permutations(str, ""); // start recursion from index 0
    }
}
