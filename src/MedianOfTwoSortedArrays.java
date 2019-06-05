import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        int inter=0;
        for (int num : nums1) {
            result[inter++]=num;
        }
        for (int num : nums2){
            result[inter++]=num;
        }
        Arrays.sort(result);
        int len = result.length;
        if (len%2==0){
            return ((double)(result[len/2]+result[len/2-1]))/2;
        }else{
            return result[len/2];
        }
    }

    public static void main(String[] args){
        int[] nums1=new int[]{1,3};
        int[] nums2=new int[]{2};
        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2));
    }
}
