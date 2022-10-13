package box3;

public class Box {
	  int width;
	  int height;
	  int depth;
	  int volume;
	  
	  Box(){
		  this(0,0,0);
	  }
	  Box(int w,int h,int d) {
		  width= w;
		  height= h;
		  depth= d;
		  volume = 0;
	  }
	  
	  public Box volume_compute(Box instance_box) {
		  Box v_box = new Box();
		  v_box.width=instance_box.width;
		  v_box.height=instance_box.height;
		  v_box.depth=instance_box.depth;
		  v_box.volume= v_box.width* v_box.height*  v_box.depth;
		  return v_box;
	  }

}