import java.util.Scanner;

    public class Main {
        public static void main (String[] arg) {

            String[] names = {
"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
"Aaron", "Kate"
};
                int[] times = {
341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
343, 317, 265
};


int min;
int min2;
int minIndex = 0;
int minIndex2 = 0; 

    if(times[0]<times[1]){
        min = times[0];
        min2 = times[1];
    }else{
        min = times[1];
    min2 = times[0];
    }


    for(int i = 0;i<times.length;i++){

        if(min>times[i]){
            min2 = min;
            min = times[i];
            minIndex = i;

        }else{

            min2 = times[i];
            minIndex2 = i;
        }
    }


    System.out.println("The fastest runner is: "+names[minIndex]+" and his/her time is: "+times[minIndex] );
    System.out.println();
    System.out.println();
    System.out.println("The second fastest runner is: "+names[minIndex2]+" and his/her time is: "+times[minIndex2]);
    
}
}