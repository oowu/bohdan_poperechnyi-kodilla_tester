import java.util.Random;

public class Loops {
    public static void main (String[] args){
        int[] myArray = new int[]{1,2,3,4,5};
        loopArray(myArray);

    }

    public static int loopArray(int[] someArray) {
        int sum = 0;

        for (int i = 0; i < someArray.length; i++) {
            sum = sum+someArray[i];
        }
        return sum;

    }
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}

