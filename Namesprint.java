import java.util.Scanner;
public class Namesprint {
public static void main (String[] args){
	String[] names=new String[3];
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter three names");
	names[1]= scan.nextLine();
	names[2]=scan.nextLine();
	names[3]= scan.nextLine();
	System.out.println(" Print the names [1], [2],[3]");
}
}
