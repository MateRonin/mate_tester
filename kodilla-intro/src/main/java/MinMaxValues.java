public class MinMaxValues {
    public static void main (String args[]) {
        int numbers[] = {1, 5, -9, 12, -3, 89, 18, 23, 4, -6};

        System.out.println("Minimum Value = " + getMinValue(numbers));

        System.out.println("Maximum Value = " + getMaxValue(numbers));
    }
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
