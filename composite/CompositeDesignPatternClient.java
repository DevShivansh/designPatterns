package composite;

public class CompositeDesignPatternClient {

	public static void main(String[] args) {
		Employee employee = new Developer(1, "Shivansh");
		display(employee);
		Employee employee2 = new Developer(2, "Mehul");
		display(employee2);
		Employee manager = new Manager(3, "Ashwani");
		display(manager);
		
		CompanyEmployees company = new CompanyEmployees();
		company.addEmployee(employee);
		company.addEmployee(employee2);
		company.addEmployee(manager);
		display(company);
		

	}
	
	public static void display(Employee e) {
		e.showEmpDetails();
	}

}
