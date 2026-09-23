import java.util.*;

// Import a package for Scanner function .Where we get input using this Scanner function.

	class GCalck{

	public static void main(String args[]){

	Scanner input = new Scanner(System.in);

	// Here we create a input name object using new keyword and get input to user .
	
	System.out.println("Enter the two number and perform calculation like (+ , - , * , /)");

	int num1 = input.nextInt();

	int num2 = input.nextInt();

	//Here I am create two variable and through a massge to user enter the two number and store in this varable .

	System.out.print("Enter an Operatro(+ , - , * , /)");

	char operator = input.next().charAt(0);

	// Here i am get Operator by user .

	int output ;
	// This output name variable is stored our output valus like two number of sum, sub etc,,.

	if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
	//This condition checking  the user given right operator or not .

	switch(operator){
	
        case '+':

	output = num1 + num2;

        System.out.println("Sum is : " + output);

        break;

       }
 
	}else{
	
    System.out.println("Plese enter a valid Operator like (+ , - ,* , / )");
	
		}
	}
}
