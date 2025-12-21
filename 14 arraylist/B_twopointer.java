import java.util.ArrayList;

public class B_twopointer {
    // O(n) time complexity
    public static int maxArea(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int area = ht * width;
            if (area > maxWater) {
                maxWater = area;
            }

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
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
