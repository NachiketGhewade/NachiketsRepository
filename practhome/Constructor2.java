package practhome;

public class Constructor2 extends Constructor1{

	
	public Constructor2() {
		super();
		System.out.println("default const of child class");
	}
	public Constructor2(int i) {
		super(i);
	}
	public static void main(String[] args) {
		Constructor2 obj = new Constructor2();
		Constructor2 obj1 = new Constructor2(25);
	}

}
