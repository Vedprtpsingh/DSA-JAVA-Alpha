
class Solution {
    class Solution {
        public int removeDuplicates(int[] nums) {
    
            int arr[];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<i;j++){
                    if(nums[i]==nums[j]){
                        arr[i]="_";
                    }else{
                        arr[i]=num[i];
                    }
                }
            }
            System.out.println(arr[]);
        }
    }
public static void main(String args[]){
        int nums1[]={1,2,3,14,5,6};
        int nums2[]={4,0,9};
        //findMedianSortedArrays(nums1,nums2);
        findMedianSortedArrays(nums1,nums2);
    }
}