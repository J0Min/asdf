package a;

class Circle extends Point{
	double radius,A;
	Circle(double xp,double yp,double rad){
		super.setpoint_x(xp);
		super.setpoint_y(yp);
		radius =rad;
	}
	double getrad(){
		return radius;
	}
	void setrad(double radius){
		this.radius = radius;  
	}
	double getarea() {
		A = 3.14 * radius * radius;
		return A;
	}
	void getEnd() {
		super.print_point();
		System.out.println("������ = " + radius);
		System.out.println("���� ���� = " + getarea());
	}
}