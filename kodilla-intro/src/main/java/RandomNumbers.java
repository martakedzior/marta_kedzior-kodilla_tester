import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    private int [] randomNumbers;
    private int size;

    public RandomNumbers() {
        this.randomNumbers = new int[1000];
        this.size = 0;
    }

    public void getSumOfRandomNumbers() {
        Random randomNumber = new Random();
        int sum = 0;

        while (sum < 5000) {
            int temp = randomNumber.nextInt(30);
            this.randomNumbers[this.size] = temp;
            sum = sum + temp;
            this.size++;
        }
    }

    public void minNumber(){
        int minNumber;
        minNumber = Arrays.stream(randomNumbers).min().getAsInt();
        System.out.println("Minimalna wylosowana wartość to: "+ minNumber);
    }

    public void maxNumber(){
        int minNumber;
        minNumber = Arrays.stream(randomNumbers).max().getAsInt();
        System.out.println("Maksymalna wylosowana wartość to: "+ minNumber);
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getSumOfRandomNumbers();
        randomNumbers.minNumber();
        randomNumbers.maxNumber();

    }
}
