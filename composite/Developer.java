package composite;

public class Developer implements Employee{
	
	private int id;
	private String name;
	private String designation;
	
	public Developer(int id, String name) {
		this.id = id;
		this.name = name;
		this.designation = "Developer";
	}

	@Override
	public void showEmpDetails() {
		System.out.println("EMP ID : " + id + ", NAME : " + name + ", DESIGNATION : " + designation);
		
	}

	
}
