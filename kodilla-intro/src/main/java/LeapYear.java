public class LeapYear {
    public static void main(String[] args){
        int yearToCheck = 2000;

        if (yearToCheck % 4 == 0 && yearToCheck % 100 == 0 && yearToCheck % 400 == 0){
            System.out.println("Rok " + yearToCheck + " jest rokiem przestępnym.");
        } else {
            System.out.println("To nie jest rok przestępny.");
        }

    }
}
