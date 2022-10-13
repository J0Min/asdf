package a;

public class Point {
	double x,y;
	Point(){
		x = 0;
		y = 0;
	}
	double getpoint_x(){
		return x;
	}
	double getpoint_y(){
		return y;
	}
	void setpoint_x(double x){
		this.x = x;  
	}
	void setpoint_y(double y){
		this.y = y;  
	}
	void print_point() {
		System.out.println("x = "+ x + " y = " + y);
	}
}

