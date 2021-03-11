
public class DepartmentTest {
	Department deparment = new Department("DeparmentTestName");
	Employee employee = new Employee("Ola", "Nordmann", "10001");
	Employee employee1 = new Employee("Kari", "Nordmann", "20002");
	Employee employee2 = new Employee("Syke", "Søster", "30003");
	Patient patient = new Patient("Syk", "Nordmann", "4004");
	Patient patient1 = new Patient("Petter", "Northug", "5005");	
	
	
	void AddPersons() {
	deparment.getEmployees().add(employee);
    deparment.getEmployees().add(employee2);
    deparment.getEmployees().add(employee1);
    deparment.getPatients().add(patient);
    deparment.getPatients().add(patient1);
}
}
