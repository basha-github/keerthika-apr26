class A{
	int a1;
	int a2;
	public A(int a1, int a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	@Override
	public String toString() {
		return "A [a1=" + a1 + ", a2=" + a2 + "]";
	}
	
	
}

class B extends A{
	int b1;
	int b2;
	public B(int a1, int a2, int b1, int b2) {
		super(a1, a2);
		this.b1 = b1;
		this.b2 = b2;
	}
	
	
	
}


public class Demo {

	public static void main(String[] args) {
		
		Person p1 = new Person("423-fdasdf-23-dsf",
				"Keerthika","9845098450","Vij");
	
		Employee e1 = new Employee("31234-sgf-dg-231","Ramu","HYD"
				,"9845098450",1213,"IBM",45000);
		
		
		Employee e2 = new Employee(p1,45690,"HP",67000);
		System.out.println(e1);
		System.out.println(e2);
	}

}
