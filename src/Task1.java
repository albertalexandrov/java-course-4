import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 4;
        String[] nums = new String[size];
        Random randomizer = new Random();
        for (int i = 0; i < size; i++) {
            int num = randomizer.nextInt(100);
            nums[i] = String.valueOf(num);
        }
        String delimiter = " ".repeat(3) ;
        System.out.println(String.join(delimiter, nums));
    }
}