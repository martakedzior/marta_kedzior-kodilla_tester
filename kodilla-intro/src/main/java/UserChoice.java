import java.util.Scanner;
public class UserChoice {

    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the colour you would like to provide:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "Aquamarine";
                case "B": return "Black";
                case "C": return "Coral";
                case "E": return "Emerald";
                case "F": return "Fuchsia";
                case "G": return "Green";
                case "I": return "Indigo";
                case "J": return "Jade";
                case "O": return "Orange";
                case "P": return "Purple";
                case "R": return "Red";
                case "Y": return "Yellow";
                default:
                    System.out.println("I don't know this colour. Try again.");
            }
        }
    }

}