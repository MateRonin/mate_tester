public class Loops {
    public static int sumNumbers(int[] numbers) {
        numbers = new int[3];
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }
}
