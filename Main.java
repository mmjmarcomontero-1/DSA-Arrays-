import java.util.Scanner;




    public class Main{
        public static void main(String[] args){

        int[] arr = {3,0,9,12,15,0,0,6};

        int nz = 0;
        int  z = 0;

        while(nz<arr.length){

            if(arr[nz]!=0){

                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                    nz++;
                     z++;

            }else{

                nz++;

                }
            }
            for (int k : arr) {
                System.out.println(k);
            }
        } 
    }