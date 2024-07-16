package ex4;
class distance{
	float feet;
	float inches;
	distance(){
		feet=0;
		inches=0;
	}
	distance(float f,float i){
		feet=f;
		inches=i;
	}
	void display(){
		System.out.println("Feet : "+feet);
		System.out.println("inches : "+inches);
	}
	distance dis(distance d) {
		feet=this.feet+d.feet;
		inches=this.inches+d.inches;
		distance d1=new distance(feet,inches);
		return d1;
	}
}
public class Ex4_3 {

	public static void main(String[] args) {
		distance d2=new distance(5,3);
		distance d3=new distance(7,12);
		distance d4;
		d4=d2.dis(d3);
		d4.display();
	}

}
