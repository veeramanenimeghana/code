package New;
import java.util.Scanner;

public class Nums {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[20];

	  
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Enter an integer: ");
	            numbers[i] = scanner.nextInt();
	        }

	
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int oddCount = 0;
	        int evenCount = 0;
	        int zeroCount = 0;

	   
	        for (int num : numbers) {
	            if (num > 0)
	                positiveCount++;
	            else if (num < 0)
	                negativeCount++;
	            else
	                zeroCount++;

	            if (num % 2 == 0 && num != 0)
	                evenCount++;
	            else if (num != 0)
	                oddCount++;
	        }

	    
	        System.out.println("Number of positive numbers: " + positiveCount);
	        System.out.println("Number of negative numbers: " + negativeCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	        System.out.println("Number of even numbers: " + evenCount);
	        System.out.println("Number of zeros: " + zeroCount);

	      
	        scanner.close();
	    }
	
}