public class e_gridways {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        // move down
        int downWays = gridWays(i + 1, j, n, m);
        // move right
        int rightWays = gridWays(i, j + 1, n, m);

        return downWays + rightWays;
    }

    public static void main(String args[]) {
        int n = 3, m = 4;
        System.out.println("Total ways" + gridWays(0, 0, n, m));
    }
}
