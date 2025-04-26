
public class Person {
	
	
	String aadhar;
	String name;
	String mobile;
	String address;
	
	public Person(String aadhar, String name, String mobile, String address) {
		this.aadhar = aadhar;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [aadhar=" + aadhar + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
	

}

