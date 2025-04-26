
public class Employee  extends Person {
	

	int eid;
	String org;
	float sal;
	public Employee(String aadhar, String name, String mobile, 
			String address, int eid, String org, float sal) {
	
		super(aadhar, name, mobile, address);
		this.eid = eid;
		this.org = org;
		this.sal = sal;
	}
	public Employee(Person p1, int eid, String org, int sal) {
		super(p1.aadhar, p1.name, p1.mobile, p1.address);
		this.eid = eid;
		this.org = org;
		this.sal = sal;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee ["
				+ "aadhar="+aadhar+
				" "+
				"name="+name+" "+
				"address="+address+" "+
				"mobile="+mobile+" "
				+ "eid=" + eid + ", org=" + org + ", sal=" + sal + "]";
	}
	
	
	

}
