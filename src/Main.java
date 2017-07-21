import java.io.FileNotFoundException;

/*
 * Creating a class Main it contains Main method
 * 
 */
public class Main {

	public static void main(String[] args)throws FileNotFoundException {
		//making object of ExceptionDemo class
		ExceptionDemo obj= new Child();
		//putting the risky code
		//Here i am calling the method of the parent class but it is saying 
		//To handle the exception thrown in the parent class
			obj.method();
		

	}

}
