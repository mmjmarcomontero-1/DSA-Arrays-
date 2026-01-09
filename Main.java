import java.util.Scanner;
import java.util.HashMap;


    public class Main{
        public static void main(String[] args){

            int[] arr = {1,2,3,4,4,5,6,7,8,9,10};
            HashMap<Integer, Integer> count = new HashMap<>();


            for (int numbers : arr) {
                
                if(count.containsKey(numbers)){

                    int actualValue = count.get(numbers);
                    count.put(numbers,actualValue+1);
                }else{

                count.put(numbers,1);
            }
            }


            for (Integer num : count.keySet()){

                if(count.get(num)>1){

                    System.out.println("Numbers wich appear more than 1 time: "+num);

                }
                
            }



















        }
    }