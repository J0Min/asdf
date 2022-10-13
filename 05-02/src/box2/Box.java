package box2;

public class Box {
	private  int width;
	private  int height;
	private  int depth;
	private  int volume;
	   
	   Box(int w, int h, int d) {   
		    width=w;  
		    height=h;
		    depth=d;
		    this.volume();
		}
	   
	   private void volume() {
		   volume = width * height * depth;
		}
	   public int getwidth() {
		   return width;
	   }
	   public int getheight() {
		   return height;
	   }
	   public int getdepth() {
		   return depth;
	   }
	   public int getvolume() {
		   return volume;
	   }
	   public void setwidth(int w) {
		   if(w<=100) width = w;
	   }
	   public void setheight(int h) {
		   height = h;
	   }  
	   public void setdepth(int d) {
		   depth = d;
	   }
}
