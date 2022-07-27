public class test_0217_4 {

    public static void main(String[] args) {
        new test_0217_4().start();
    }

    public void start() {
        int[] nums = {1, 3, 4, 5};
        int target = 7;

        twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] twoNum = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoNum[0] = i;
                    twoNum[1] = j;

                    System.out.println(twoNum[0]);
                    System.out.println(twoNum[1]);
                    break;
                }
            }
        }
        return twoNum;
    }
}
