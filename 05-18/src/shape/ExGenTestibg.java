package shape;

public class ExGenTestibg {
  	public static void main(String args[]) {
  		try{int a = 0;
    		int b = 2;
    		System.out.print("2/0은 : "); 
    		int div = b / a;                       
    		System.out.println(div);}
    	  	catch(ArithmeticException e) {
        		 System.out.println("정석태 프로그램 오류 ");
     	
    	}
}}