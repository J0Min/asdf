package ex;

class Box {
	int width;
	int height;
	int depth;
	int vol;
	public Box(int a, int b, int c)
	{
		width=a;
		height=b;
		depth=c;
	}
	 public int volume()
	{
		vol=width*height*depth;
		System.out.println("Volume is "+vol);
		return vol;
	}
	
}
