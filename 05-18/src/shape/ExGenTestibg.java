package shape;

public class ExGenTestibg {
  	public static void main(String args[]) {
  		try{int a = 0;
    		int b = 2;
    		System.out.print("2/0�� : "); 
    		int div = b / a;                       
    		System.out.println(div);}
    	  	catch(ArithmeticException e) {
        		 System.out.println("������ ���α׷� ���� ");
     	
    	}
}}