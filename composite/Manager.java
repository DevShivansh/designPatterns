package composite;

public class Manager implements Employee{
	
	private int id;
	private String name;
	private String designation;
	
	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
		this.designation = "Manager";
	}

	@Override
	public void showEmpDetails() {
		System.out.println("EMP ID : " + id + ", NAME : " + name + ", DESIGNATION : " + designation);
		
	}

	
}

