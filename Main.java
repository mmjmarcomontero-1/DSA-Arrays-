import java.util.Scanner;


    public class Main{
        public static void main(String[] args){

            int[] arr = {1,2,2,3,4,5,6,7,8,9,10,10,10,10,10};
                int Index = -1;

            outer:
            for(int i = 0;i<arr.length;i++){
                for(int k = 0;k<i;k++){

                    if(arr[i]==arr[k]){
                        Index = i;
                        break outer;

                    }
                }
            }
            if(Index<0)
                System.out.println("Ther's not number repeated");
            else{

                System.out.println("The first number repeated is: "+arr[Index]);
            }
        }
    }