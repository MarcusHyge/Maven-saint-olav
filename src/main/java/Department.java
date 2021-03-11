import java.util.ArrayList;

public class Department {
String departmentName = "";
ArrayList<Employee> employeeList = new ArrayList<>();
ArrayList<Patient> patientList = new ArrayList<>();



public Department(String departmentName) {
	this.departmentName = departmentName;
	ArrayList<String> Department1 = new ArrayList<String>();
	
}

void setDepartmentName(String departmentName) {
	this.departmentName = departmentName; 
}

String getDepartmentName() {
	return this.departmentName;
}

void addEmployee(Employee employee) {
	employeeList.add(employee);
}

public ArrayList<Employee> getEmployees() {
    return employeeList;
}



addPatient

}