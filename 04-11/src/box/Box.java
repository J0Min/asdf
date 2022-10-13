package box;

public class Box {
	   int width;
	   int height;
	   int depth;
	   
	   public Box()  { 
	      this(1,1,1);
	   }
	  public Box(int w) {  
	      this(w,1,1);
	     }
	  public Box(int w, int h) {
	      this(w,h,1);
		 }
		public Box(int w, int h, int d) {   
		    width=w;  
		    height=h;
		    depth=d;  
		}
}
