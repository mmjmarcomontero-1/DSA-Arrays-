import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;



    public class Main{

        static boolean def(int[] arr,int k){

            if(arr[k]<arr[k+1]){
 

                return true;

            }else{

                return false;

            }
        }



            public static void main(String[] args){


                boolean result = false;

                int[] arr = {1,3,5,7,9,11,13,15,100,};


                for(int i = 0;i<arr.length-1;i++){

                   result = ( def(arr,i)) ;

                    if(result==false){
                        System.out.println("The function isn't order in lower higher values");
                        return;

                    }

                }

                System.out.println("The function is order in Higher Lower values");





        }
    }