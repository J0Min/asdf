package example;

class ExceptionSearch {
	   static int a, b;
	   public static void main(String args[]) {
	      try {
	        a = Integer.parseInt(args[0]);    
	        b = Integer.parseInt(args[1]);
	        System.out.println("매개변수로 입력받은 두 개의 값 :");
	        System.out.println(" a = " + a + " b = " + b );
	        System.out.println("=========================");
	        System.out.println("a() 메소드 호출 전");
	        a();
	        System.out.println("a() 메소드 호출 후");
	     }
	    catch(Exception e) {
	       System.out.println("Exception 처리 루틴 : ");
	       System.out.println(e + " 예외 발생");
	    }
	    finally {
	       System.out.println("메소드 main()의 finally 블록 수행");
	    }
	  }
	   public static void a() {
		    try {
		        System.out.println("b() 메소드 호출 전");
		        b();
		        System.out.println("b() 메소드 호출 후");   // 수행 않음
		      }
		      catch(ArithmeticException e) {
		        System.out.println("ArithmeticException 처리 루틴 : ");
		        System.out.println(e + " 예외 발생"); 
		      }
		      finally {
		        System.out.println("메소드 a()의 finally 블록 수행");
		      }
		    }  
	  public static void b() {
		    try {
		      System.out.println("c() 메소드 호출 전");
		      c();
		      System.out.println("c() 메소드 호출 후");           // 수행 않음
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("ArrayIndexOutOfBoundsException  처리 루틴 : ");
		      System.out.println(e + " 예외 발생");    
		    }
		    finally {
		      System.out.println("메소드 b()의 finally 블록 수행");
		    }}
		public static void c() {
		    try {
		      System.out.println(" a를 b로 나눈 몫 = " + (a/b) );      // 에러 
		                                                                               // ArithmeticException
		    }
		    catch(ClassCastException e) {
		      System.out.println("ClassCastException 처리 루틴 : ");
		      System.out.println(e + " 예외 발생");       
		    }
		    finally {
		      System.out.println("=========================");
		      System.out.println("메소드 c()의 finally 블록 수행");
		    }}}
