public class ErrorC {

    public static void main(String[] args) {
        System.out.println("Multiplication Table of 7");
        int a = 7;
        int ans = 0;
        int i;

        for (i = 1; i <= 10; i++) {
            ans = a * i;
            System.out.println(ans + "\n");
        }
    }
}
