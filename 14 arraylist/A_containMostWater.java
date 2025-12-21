import java.util.ArrayList;

public class A_containMostWater {
    // O(n^2) time complexity
    // brute force approach
    public static int maxArea(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int area = ht * width;
                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxArea(height));
    }
}