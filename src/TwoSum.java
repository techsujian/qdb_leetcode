/**
 * 主要是题意说不能用相同的元素，理解为不能用相等的数了，所以错误了一次
 * 很简单，两层循环嵌套遍历即可
 * 更优的解-当数据量比较大时，可以考虑对数进行排序，然后再求解，时间复杂度nlogn
 */
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        for (int inter_i=0;inter_i<len;inter_i++){
            for (int inter_j=inter_i+1;inter_j<len;inter_j++){
                if (nums[inter_i]+nums[inter_j]==target){
                    result[0]=inter_i;
                    result[1]=inter_j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr=new int[]{2,7,11,15};
        int target = 9;
        int[] result=new TwoSum().twoSum(arr,target);
        System.out.println(result[0]+","+result[1]);
    }
}
