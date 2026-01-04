import java.util.Scanner;


    public class Main{
        public static void main(String[] args){

            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            int[] arr2 = new int[arr.length];
            arr2[0] = arr[0];
            int j = 1;
            int sum = 0;


          

            for(int i = 1;i<arr.length;i++){

                sum += arr[i-1];

                arr2[j]=sum;
                j++;
            }





for (int z : arr2) {
    System.out.println(z);
}



        }
    }