public class function_overloading {

    // Multiple function with the same name but different parameters like type of
    // parameters or no.s of parameters function overloading not depend on return
    // type

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // function overloading with datatypes
    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));

        // function overloading with datatypes
        System.out.println(sum(3, 5));
        System.out.println(sum(2.2f, 1.5f));

    }

}
