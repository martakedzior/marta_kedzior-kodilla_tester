public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook= new Notebook("600g", 900, 2021);
        System.out.println(notebook.getWeight() + " " + notebook.getPrice());
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook= new Notebook("2000g", 1500, 2019);
        System.out.println(heavyNotebook.getWeight() + " " + heavyNotebook.getPrice());
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook= new Notebook("1200g", 500, 2010);
        System.out.println(oldNotebook.getWeight() + " " + oldNotebook.getPrice());
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
    }
}
