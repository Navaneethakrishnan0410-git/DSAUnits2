package Unit2.Day10;

import java.util.Arrays;
public class BubbleSortDemo {
        public static void main(String[] args) {
            int[] nums={100,49,66,38,26};
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                boolean isSwapped=false;
                for(int j=0;j<n-1-i;j++){
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        isSwapped=true;
                    }
                }
                if(!isSwapped){
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

