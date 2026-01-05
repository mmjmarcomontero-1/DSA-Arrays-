import java.util.Scanner;


    public class Main{

        static void Rotate(int[] arr){

            int temp = arr[0];

            for(int i = 1;i<arr.length;i++){

                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
        }

        static void rotate(int[] arr,int k){

            k %= arr.length;
            if(k<0){

                k += arr.length;

            }

            for(int i = 1;i<=k;i++){

                Rotate(arr);

            }
        }


        static void main(String[] args){
            Scanner o = new Scanner(System.in);
            int[] arr = {1,2,3,4,5,6,7,8,9,10};

            System.out.println("Enter a number,positive for turnin right(e.g 2 3 4 5 1 ) or negative to turn left (e.g 5 1 2 3 4)" );
            int k = o.nextInt();

 
            rotate(arr,k);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }