class Sales {
     String title;
     int quantity;
     public Sales(String t){
          this(t,0);
     }
     public Sales(String t, int q){
          title=t;
          quantity=q;
     }
}

public class SalesDemo {
      public static void main(String[] args) {
             Sales s1=new Sales("�尩");
             Sales s2=new Sales("�縻",200);
             System.out.println("�Ǹ�ǰ�� :" +s1.title +" " +"���� :"+s1.quantity);
             System.out.println("�Ǹ�ǰ�� :" +s2.title +" " +"���� :"+s2.quantity);
         }
}