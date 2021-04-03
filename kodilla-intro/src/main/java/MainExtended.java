public class MainExtended {
    public static void main(String[] args) {
        String myName = "Marta";
        int myAge = 100;
        double height = 1.68;
        char gender = 'F';
        boolean isChocolateFan = true;
        String greeting = "Hello Ms. Marta!";
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(height);
        System.out.println(gender);
        System.out.println(isChocolateFan);
        System.out.println(greeting);

        String example = sayHello();

    }

    private static String sayHello() {
        String text = "Hello from FirstClass!";
        System.out.println(text);
        return text;
    }
}
