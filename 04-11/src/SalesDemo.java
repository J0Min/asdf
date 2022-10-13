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
             Sales s1=new Sales("장갑");
             Sales s2=new Sales("양말",200);
             System.out.println("판매품목 :" +s1.title +" " +"수량 :"+s1.quantity);
             System.out.println("판매품목 :" +s2.title +" " +"수량 :"+s2.quantity);
         }
}