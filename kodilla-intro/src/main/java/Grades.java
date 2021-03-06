import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void last() {
        int lastGrade = grades[size-1];
        System.out.println(lastGrade);
    }

    public void average(){
        double sumGrades = (Arrays.stream(grades).sum());
        double averageGrade = sumGrades/size;
        System.out.println(averageGrade);
    }
}
