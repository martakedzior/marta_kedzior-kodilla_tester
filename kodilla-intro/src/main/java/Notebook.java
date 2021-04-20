public class Notebook {
    String weight;
    int price;
    int weightInt;
    int year;

    public Notebook(String weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.weightInt = Integer.parseInt(weight.replace("g",""));
        this.year = year;
    }

    public void checkPrice(){
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if (this.weightInt <= 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weightInt > 600 && this.weightInt <= 1200) {
            System.out.println("The notebook is not so heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice(){
        if (this.price <= 600 && this.year < 2010){
            System.out.println("This notebook is old and cheap!");
        } else if (this.price >= 1500 && this.year > 2018){
            System.out.println("This notebook is expensive and modern!");
        }
    }
}
