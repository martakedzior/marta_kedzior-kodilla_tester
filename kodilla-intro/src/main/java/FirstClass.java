public class FirstClass {
    public static void main(String[] args) {
        String example = "Hello from First Class!";
        System.out.println(example);

        Notebook notebook= new Notebook("600g", 900, 2021);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook= new Notebook("2000g", 1500, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook= new Notebook("1200g", 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
    }
}
