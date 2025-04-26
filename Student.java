
public class Student {
	
	int id;
	String name;
	String college="KLU";
	float fee;
	int maks;
	public Student(int id, String name, float fee, int maks) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.maks = maks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public int getMaks() {
		return maks;
	}
	public void setMaks(int maks) {
		this.maks = maks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", fee=" + fee + ", maks=" + maks
				+ "]";
	}
	
	
	
	
	
	
	

}
