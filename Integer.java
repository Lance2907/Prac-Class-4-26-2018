import java.util.Scanner;
public class Integer {
public static void main (String []args){
	Scanner scan=new Scanner(System.in);
 int [] numbers= {14,17,19,15,28,48,57,79};
 // calculate the sum of all arrays
 int sum=0;
 for (int i=0; i< numbers.length; i++){
	 sum =sum+numbers[i];
 // calculate verage value 
	 double average=sum/numbers.length;
	 System.out.println("Average value of the array element"+ average);
 }
}
}
