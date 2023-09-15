
// package seminar1;

import java.util.Arrays;

public class task2 {
        public static void main(String[] args){
            // Дан массив nums = [3,2,5,3] и число val = 3. 
            // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
            // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
            int[] nums = {3,2,5,3,4,5,3,2,3,2,3};
            int val = 3;
            int lenNum = nums.length;
            int[] newNum;
            newNum = new int[lenNum];
            Arrays.fill(newNum,val);
            int count = 0;

            for (int i = 0; i < nums.length; i++){
                if (nums[i] != val){
                    newNum[count] = nums[i];
                    count++;
                }
            }

            System.out.print(Arrays.toString(newNum));

            // public class program {
            //     public static void main(String[] args) {
            //         int[] nums = {3,2,5,3,7,5,3,4,2};
            //         int val = 3;
            //         int[] newArr = searching(nums, val);
            //         System.out.println(Arrays.toString(newArr));
            
            //     }
            //     static int[] searching(int[] arr, int number){
            //          int[] newArr = new int[arr.length];
            //          Arrays.fill(newArr, number);
            //          int count = 0;
            //         for (int i = 0; i < arr.length; i++) {
            //             if (arr[i]!=number){
            //                 newArr[count]=arr[i];
            //                 count++;
            //             }
            //         }
            //         return newArr;
            
            //     }
            // }
        }
    }
