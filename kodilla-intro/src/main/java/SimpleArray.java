public class SimpleArray {
    public static void main(String[] args){
        String[] books = new String[5];

        books[0] = "Harry Potter";
        books[1] = "Lord of the Rings";
        books[2] = "Book of the Jungle";
        books[3] = "Book 4";
        books[4] = "Book 5";

        String book3 = books[2];
        System.out.println(book3);

        int numberOfTableElements = books.length;
        System.out.println("Moja tablica zawiera " + numberOfTableElements + " elementów.");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);

        }
    }
}
