import java.util.ArrayList;
import java.util.List;

public class test_0217_3 {
    /*
        For example,
        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
                return [0, 1].
        */
    public static void main(String[] args) {

        new test_0217_3().start();
    }

    public void start() {
        int[] array = {2, 7, 11, 15};
        int target = 18;

        new test_0217_3().plusArray(array, target);
    }

    public void plusArray(int[] array, int target) {
        List<Integer> arrSum = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    // System.out.println(array[i]);
                    // System.out.println(array[j]);
                    arrSum.add(array[i]);
                    arrSum.add(array[j]);
                }
            }
        }
        int[] z = arrSum.stream().mapToInt(Integer::intValue).toArray();

        System.out.print("배열 :");
        for (int i = 0; i < arrSum.size(); i++) {
            System.out.print(" " + z[i]);
        }

    }

}
