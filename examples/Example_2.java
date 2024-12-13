public class Example_1 {
    public static void main(String[] args) {
        int[] originalArray = { -26, 99, 46, -89, 57, 27, 77, -79, 48, -5 };

        int[] reversedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
