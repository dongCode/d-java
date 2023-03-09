class Solution {
    /* 
      * 双循环遍历法
      *
     */
    public static int[] twoSum(int[] nums, int target) {

        int len = nums.length;

        for(int i = 0; i < len;i++) {

            for(int n = i + 1;n < len;n++ ) {

                if(nums[i] + nums[n] == target) {

                    System.out.println(nums[i]);
                    System.out.println(nums[n]);

                    return new int[]{i,n};

                }
            }
        }
        /* 容量为0的数组即空数组 */
        return new int[0];
    }

    public static void main(String[] args) {

        int[] ints = {3,2,4};
        int target = 6;
        
        twoSum(ints, target);

    }
}