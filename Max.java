public class Max {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one number as a command line argument.");
            return;
        }

        int max = Integer.parseInt(args[0]); // Initialize max with the first number

        // Iterate through the remaining numbers and update max if a larger number is found
        for (int i = 1; i < args.length; i++) {
            int currentNumber = Integer.parseInt(args[i]);
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
