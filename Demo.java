// import java.util.Arrays;

class Demo {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0, len = nums.length; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }

        return new int[2];
    }

    public static void main(String args[]) {
        int [] arr = new int[2];

        int [] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        arr = twoSum(nums, target);

        System.out.printf("[%d, %d]\n", arr[0], arr[1]);
    }
}


