public class GradesMain {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add(4);
        grades.add(5);
        grades.add(2);
        grades.add(3);

        grades.last();
        grades.average();
    }
}
