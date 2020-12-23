import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

 double sumA = 0;
 Scanner caralho = new Scanner(System.in); 
 double sumAL = 0;

 double array1[]=new double[10];

 ArrayList<Double> array1List = new ArrayList<Double>();



 int y = 0;

 int z = 0;

 for (int x = 0; x < 10; x++) {
 System.out.println("type a double value here:");
 array1[x] = caralho.nextDouble() ;
 array1List.add(array1[x]);
  
  }
 System.out.println("Your array looks like this " + Arrays.toString(array1));
 System.out.println("Your array list looks like this  " + array1List);

 do {

   sumA = sumA + array1[y];
   sumAL = sumAL + array1List.get(z);
   y++;
   z++;
 }
 while ((y < array1.length) && (z < 10));
 System.out.println("the average of the array is: " + (sumA/10));
 System.out.println("The average of the array list is: " + (sumAL/10));
  }
}