package Unit2.Day9;

import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the elements for an array");
            int[] nums=new int[5];
            for(int i=0;i<5;i++){
                nums[i]=sc.nextInt();
            }

            //Printing all array elements
            for(int i=0;i<5;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            for(int temp:nums){
                System.out.print(temp+" ");
            }
        }
    }

