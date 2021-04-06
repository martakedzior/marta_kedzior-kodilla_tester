public class Loops {
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int [] myTable = {1, 2, 566, 332, -3};
        System.out.println(sumTableElements(myTable));

    }

    public static int sumTableElements(int[] myTable) {
        int sumOfTableElements = 0;
        for (int i = 0; i < myTable.length; i++) {
            sumOfTableElements = myTable[i] + sumOfTableElements;
        }
        return  sumOfTableElements;
    }

}
