package Unit2.Day9;

public class BinarySearch {
        public static void main(String[] args) {
            int target=50;
            int[] nums={10,20,30,40,50,60};
            int start=0;
            int end=nums.length-1;
            int index=-1;
            while (start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target){
                    index=mid;
                    break;
                }else if(nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            System.out.println("Target is found at "+index);
        }
    }

