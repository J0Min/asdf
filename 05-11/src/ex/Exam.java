package ex;

public class Exam {
	String name;
	int c,d;
	double avg;
	Exam(String na,int a,int b){
		name = na;
		c = a;
		d = b;
	}
	double Aver(){
		avg = (c+d)/2;
		return avg;
	}
}

class Exam2 extends Exam{
	int score;
	public Exam2(String na,int a,int b){
		super(na,a,b);
	}
	public double total() {
		score = c+d;
		return score;
	}
}