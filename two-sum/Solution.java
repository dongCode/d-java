import java.util.HashMap;

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
    
    /* 
        byte 8bit
        int  4bytes
     */
    public static int[] twoSumHashMap(int[] nums,int target) {

        HashMap<Integer, Integer> hashtable = new HashMap<Integer,Integer>();


        for(int i = 0; i < nums.length; i++) {

           int key = target - nums[i];

           if(hashtable.containsKey(key)) {

            return new int[]{i,hashtable.get(key)};

           } 
           /*  存储已经遍历过的值  */
           hashtable.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {

        int[] ints = {3,2,4};
        int target = 6;
        
        twoSum(ints, target);
        int[] res = twoSumHashMap(ints, target);
       

    }
}