public class Example_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as arguments.");
            return;
        }

        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[i]);
                return;
            }
        }

        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
