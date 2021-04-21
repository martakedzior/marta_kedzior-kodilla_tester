import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

    public int [] getSumOfRandomNumbers() {
        int [] randomNumbers = new int[1000];
        Random randomNumber = new Random();
        int size = 0;
        int sum = 0;

        while (sum < 5000) {
            int temp = randomNumber.nextInt(30);
            randomNumbers[size] = temp;
            sum = sum + temp;
            size++;
        }
        return randomNumbers;
    }

    public void minNumber(int [] randomNumbers){
        int minNumber;
        minNumber = Arrays.stream(randomNumbers).min().getAsInt();
        System.out.println("Minimalna wylosowana wartość to: "+ minNumber);
    }

    public void maxNumber(int [] randomNumbers){
        int minNumber;
        minNumber = Arrays.stream(randomNumbers).max().getAsInt();
        System.out.println("Maksymalna wylosowana wartość to: "+ minNumber);
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int [] number = randomNumbers.getSumOfRandomNumbers();
        randomNumbers.minNumber(number);
        randomNumbers.maxNumber(number);

    }
}
