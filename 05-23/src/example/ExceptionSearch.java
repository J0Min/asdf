package example;

class ExceptionSearch {
	   static int a, b;
	   public static void main(String args[]) {
	      try {
	        a = Integer.parseInt(args[0]);    
	        b = Integer.parseInt(args[1]);
	        System.out.println("�Ű������� �Է¹��� �� ���� �� :");
	        System.out.println(" a = " + a + " b = " + b );
	        System.out.println("=========================");
	        System.out.println("a() �޼ҵ� ȣ�� ��");
	        a();
	        System.out.println("a() �޼ҵ� ȣ�� ��");
	     }
	    catch(Exception e) {
	       System.out.println("Exception ó�� ��ƾ : ");
	       System.out.println(e + " ���� �߻�");
	    }
	    finally {
	       System.out.println("�޼ҵ� main()�� finally ��� ����");
	    }
	  }
	   public static void a() {
		    try {
		        System.out.println("b() �޼ҵ� ȣ�� ��");
		        b();
		        System.out.println("b() �޼ҵ� ȣ�� ��");   // ���� ����
		      }
		      catch(ArithmeticException e) {
		        System.out.println("ArithmeticException ó�� ��ƾ : ");
		        System.out.println(e + " ���� �߻�"); 
		      }
		      finally {
		        System.out.println("�޼ҵ� a()�� finally ��� ����");
		      }
		    }  
	  public static void b() {
		    try {
		      System.out.println("c() �޼ҵ� ȣ�� ��");
		      c();
		      System.out.println("c() �޼ҵ� ȣ�� ��");           // ���� ����
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("ArrayIndexOutOfBoundsException  ó�� ��ƾ : ");
		      System.out.println(e + " ���� �߻�");    
		    }
		    finally {
		      System.out.println("�޼ҵ� b()�� finally ��� ����");
		    }}
		public static void c() {
		    try {
		      System.out.println(" a�� b�� ���� �� = " + (a/b) );      // ���� 
		                                                                               // ArithmeticException
		    }
		    catch(ClassCastException e) {
		      System.out.println("ClassCastException ó�� ��ƾ : ");
		      System.out.println(e + " ���� �߻�");       
		    }
		    finally {
		      System.out.println("=========================");
		      System.out.println("�޼ҵ� c()�� finally ��� ����");
		    }}}
