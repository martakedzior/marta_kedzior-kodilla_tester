/* Napisz klasę, która zapyta użytkownika o pierwszą literę koloru i na jej podstawie, przy użyciu switch wybierze
   i zwróci pełną nazwę koloru. Do zadania pytania użytkownikowi należy skorzystać z metody statycznej (analogicznie, jak pytamy
   o wartość zmiennych a oraz b w przykładzie powyżej).*/

public class ColourName {
    public static void main(String[] args) {
        String userSelected = UserChoice.getUserColour();
        System.out.println("Your colour is: " + userSelected);
    }



}
