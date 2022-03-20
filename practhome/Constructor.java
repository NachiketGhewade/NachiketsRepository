package practhome;

public class Constructor {
	
	String emp_name;
	int emp_id;
	
	public Constructor() {
		System.out.println("this is constructor program");
	}
	
	public Constructor(String emp_name, int emp_id) {
		this.emp_name = emp_name;
		this.emp_id= emp_id;
		
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor("Nachiket",123456);
		
		System.out.println(obj1.emp_name + " "+ obj1.emp_id);

	}

}
