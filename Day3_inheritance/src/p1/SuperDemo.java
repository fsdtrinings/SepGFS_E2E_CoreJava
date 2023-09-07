package p1;

class A{
	A(){
		System.out.println("A Constructor");
	}
}

class B extends A{
	int y;
	public B(int y) {
		this.y = y;
		System.out.println("B Constructor");
	}
	
}

class C extends B{
	int x;
	C(int x , int y){
		super(y);
		System.out.println("fre");
		
		this.x = x;
		System.out.println("c constructor");
	}
	
}


public class SuperDemo {

	public static void main(String[] args) {
		C obj = new C(4,15);
	}
}

















