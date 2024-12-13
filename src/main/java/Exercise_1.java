public class Example_1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument for n.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer value for n.");
            return;
        }

        if (n <= 0) {
            System.out.println("Please provide a positive integer value for n.");
            return;
        }

        double[] logTable = new double[n];

        for (int i = 1; i <= n; i++) {
            logTable[i - 1] = Math.log(i);
        }

        for (double logValue : logTable) {
            System.out.println(logValue);
        }
    }
}

