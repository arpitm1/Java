package Unit1;
import java.util.Scanner; 
public class greatest {

	public static void main(String[] args) {
	      
	    int x, y,z;  
	    Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the first number: ");  
	    x = sc.nextInt();  
	    System.out.print("Enter the second number: ");  
	    y = sc.nextInt();  
	    System.out.print("Enter the third number: ");  
	    z = sc.nextInt(); 
	    int temp=(x>y)?x:y;
	    int great=(temp>z)?temp:z;
	    	System.out.println("The greatest number is: " + great); 
	    	sc.close();;
    }
	 
}


