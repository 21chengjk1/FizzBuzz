public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int number = 100;

        while (number != 0) {
            if (number % 2 == 0) {
                steps++;
                number = number / 2;
            } else{
                steps++;
                number = number - 1;
            }
        }
        System.out.println(steps);
    }
}

