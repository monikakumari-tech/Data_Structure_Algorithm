// import java.util.*;

public class Switch {
    public static void main(String[] args) {
        int number = 3;
        // if we not use break then all rest case will print
        switch (number) {
            case 3:
                System.out.println("sand");
                break;
            case 2:
                System.out.println("road");
                break;
            case 1:
                System.out.println("truck");
                break;
            default:
                System.out.println("nohting");

        }
    }
}