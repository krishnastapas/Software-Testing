package findBug;

public class CalculatorBug {
	 public int add(int a,int b) {
	   	  return a+b;
	     }
	     public int subtract(char a,char b) {
	   	  return a-b;
	     }
	     
	     public int multiply(int a,int b) {
	   	  return a*b;
	     }
	     public int divide(char a,char b) {
//	   	  if(b==0) {
//	   		  throw new ArithmeticException("cannot divide by 0");
//	   	  }
	   	  return a/b;
	     }


}
