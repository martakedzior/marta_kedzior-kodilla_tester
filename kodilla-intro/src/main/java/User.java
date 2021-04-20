public class User {
    private String name;
    private int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]){
        User marta = new User("Marta", 20);
        User kamil = new User("Kamil", 33);
        User asia = new User("Asia", 58);
        User kinga = new User("Kinga", 13);
        User adam = new User("Adam", 45);

        User[] users = {marta, kamil, asia, kinga, adam};

        double ageSumm = 0;

        for(int i=0; i<users.length; i++){
            ageSumm = users[i].age + ageSumm;
        }

        double averageAge = ageSumm / users.length;

        System.out.println("Użytkownicy to:");
        for(int i=0; i< users.length; i++)
            System.out.println(users[i].name +", "+ users[i].age +" lat");

        System.out.println("Srednia wieku to: " + averageAge);
        System.out.println("Użytkownicy w niższym wieku niż średnia wieku to: ");

        for(int i=0; i < users.length; i++){
            if (users[i].age < averageAge){
                System.out.println(users[i].name +", "+ users[i].age +" lat");
            }
        }
    }
}
