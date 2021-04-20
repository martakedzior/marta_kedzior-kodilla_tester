public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkApplication(){
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application application = new Application("Adam", 40.5, 178);
        application.checkApplication();
    }
}
