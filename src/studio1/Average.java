package studio1;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first int:");
		double n1 = in.nextInt();
		System.out.println("Please enter second int:");
		double n2 = in.nextInt();
		
		double average = (n1 + n2)/2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);

	}

}
