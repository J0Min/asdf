package example;

class ExceptionTrans {
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
	    catch(ArithmeticException e) {
	      System.out.println("ArithmeticException ó�� ��ƾ : ");
	      System.out.println(e + " ���� �߻�"); 
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBoundsException ó�� ��ƾ : ");
	      System.out.println(e + " ���� �߻�");    
	    }
	    catch(ClassCastException e) {
	      System.out.println("ClassCastException ó�� ��ƾ : ");
	      System.out.println(e + " ���� �߻�");       
	    }   
	    catch(Exception e) {
	        System.out.println("������ ��� ���� ó�� ��ƾ : ");
	        System.out.println(e + " ���� �߻�");
	      } 
	      finally {
	        System.out.println("�޼ҵ� main()�� finally ��� ����");
	      }
	    }
	   public static void a() throws ClassCastException, 
	               ArrayIndexOutOfBoundsException, ArithmeticException {
	        System.out.println("b() �޼ҵ� ȣ�� ��");
	        b();
	        System.out.println("b() �޼ҵ� ȣ�� ��");
	    }
	    public static void b() throws ArithmeticException, 
	               ArrayIndexOutOfBoundsException {
	         System.out.println("c() �޼ҵ� ȣ�� ��");
	         c();
	         System.out.println("c() �޼ҵ� ȣ�� ��");
	    }
	    public static void c() throws ArithmeticException {
	        System.out.println("���� �޼ҵ� ���� �߻� ���� ���� ��");
	        System.out.println("a�� b�� ���� �� = " + (a/b) );         
	        System.out.println("���� �޼ҵ� ���� �߻� ���� ���� ��"); 
	    }
	  }
