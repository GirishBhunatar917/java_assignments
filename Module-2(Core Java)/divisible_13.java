package assignment;

public class divisible_13 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 that are divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nNumbers between 1 and 100 that are divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nNumbers between 1 and 100 that are divisible by both 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
