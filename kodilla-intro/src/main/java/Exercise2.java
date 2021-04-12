/*
Zadanie 2.
Wykorzystując zdobytą wiedzę o tablicy, stwórz tablicę zawierającą tytuły Twoich dziesięciu ulubionych filmów.
Wyświetl ilość filmów w tablicy oraz ich tytuły oddzielając je przecinkiem (bez ostatniego przecinka)
 */

public class Exercise2 {
    public static void main(String[] args){
        String[] movies = new String[] {"Harry Potter", "Lord of the Rings", "Forrest Gump", "Cindirella", "House of Cards", "Expanse", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};

        System.out.println("W tabeli znajduje się: " + movies.length + " filmów. Oto one: ");

        for (int i = 0; i < movies.length; i++) {
            if (i < movies.length - 1) {
                System.out.print(movies[i] + ", ");
            } else {
                System.out.print(movies[i] + ".");
            }

        }
    }
}
