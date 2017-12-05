package myPackage;

public class Employee {
	private int ID;
	private String name;
	
	public Employee(int _ID, String _name) {
		this.ID = _ID;
		this.name = _name;
	}
	
	public Employee() {
		// Nothing to do
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
