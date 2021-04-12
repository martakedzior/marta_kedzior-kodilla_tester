/*
Zadanie 1.
Za pomocą edytora Kodilla stwórz kod, który:

1. Będzie sprawdzał, czy liczba X jest podzielna przez liczbę 7 bez reszty.
2. Jeżeli tak, to w konsoli wyświetl zdanie "Liczba 7 jest dzielnikiem liczby X :)
" (zamiast X ma się wyświetlać wartość zmiennej).
3. Jeżeli nie, to w konsoli ma się pojawić zdanie "Liczba 7 NIE jest dzielnikiem liczby X :(
" (tu też zamiast X ma się wyświetlać wartość zmiennej).

 */

public class Exercise1 {
    public static void main(String[] args) {
        calculation(28);
    }

    public static void calculation(double number){
        if (number%7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby " + number);
        } else {
            System.out.println("Liczba 7 NIE jest dzielnikiem liczby " + number);
        }
    }
}

