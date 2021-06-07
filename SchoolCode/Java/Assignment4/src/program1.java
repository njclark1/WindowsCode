// programmer: nickj.clark14@gmail.com
// date: 2021 03 08
// modi date:
// purpose: The purpose of this program is to find the smallest number among three numbers

// import statements
import java.util.Scanner;


public class program1   {  

	// main function
public static void main(String[] args)
{
	
	// open scanner
    Scanner scanner = new Scanner(System.in);
    
    // ask user for inputs
    System.out.print("Input the first number: ");
    double NCnumber1 = scanner.nextDouble();
    System.out.print("Input the Second number: ");
    double NCnumber2 = scanner.nextDouble();
    System.out.print("Input the third number: ");
    double NCnumber3 = scanner.nextDouble();
    
    // output results to user
    System.out.print("The smallest value is " + NCminimum(NCnumber1, NCnumber2, NCnumber3)+"\n" );
    
    // close scanner
    scanner.close();
}

	// calculating function
public static double NCminimum(double NCnumber1, double NCnumber2, double NCnumber3)
{
	// return min to main
    return Math.min(Math.min(NCnumber1, NCnumber2), NCnumber3);
}
}