public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int step = 0;
        boolean zero;

        while (zero = n != 0) {

            boolean divisibleBy2 = n % 2 == 0;

            if (divisibleBy2) {

                n = n / 2;
                step++;

            } else {

                n--;
                step++;

            }
        }

        System.out.println(step);

    }
}
