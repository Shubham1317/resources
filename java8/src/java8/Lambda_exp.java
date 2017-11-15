package java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda_exp {

	interface MathOperation{
		int operation(int a,int b);
	}
	
	private int operate(int a,int b, MathOperation mp) {
		return mp.operation(a, b);
	}
	
	interface GreetingService {
	    void sayMessage(String msg);
	}
		
	public static void main(String[] args) {
		
		// with type declaration
		MathOperation addition = (int a,int b) -> a + b;
		
		//with out type declaration
		MathOperation subtract = (a,b) -> a - b;
		
		//with return statement along with curly braces
		MathOperation multiplication = (int a,int b)->{return a*b;};
		
		//without return statement and without curly braces
	    MathOperation division = (int a, int b) -> a / b;
		
	    Lambda_exp l = new Lambda_exp();
	    
	    System.out.println("10 + 5 = " + l.operate(10, 5, addition));
	    System.out.println("10 - 5 = " + l.operate(10, 5, subtract));
	    System.out.println("10 x 5 = " + l.operate(10, 5, multiplication));
	    System.out.println("10 / 5 = " + l.operate(10, 5, division));
	    
	    //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	    
		    List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach(
	        		(str) -> System.out.println(str)
	        ); 
	      
	}

}
