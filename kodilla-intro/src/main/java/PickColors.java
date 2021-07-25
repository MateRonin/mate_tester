import java.util.Scanner;
public class PickColors {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type first letter of your colour:");
            String pick = scanner.nextLine().trim().toUpperCase();
            switch (pick) {
                case "Y":
                    return "Yellow";
                case "W":
                    return "White";
                case "B":
                    return "Black";
                case "R":
                    return "Red";
                case "P":
                    return "Pink";
                default:
                    System.out.println("No colour found! Try again!");
            }
        }
    }

    public static void main(String[] args) {
        PickColors pickColor = new PickColors();
        String result = pickColor.getUserSelection();
        System.out.println("Your colour is: " + result);
    }
}