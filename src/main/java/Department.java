import java.util.ArrayList;

public class Department{
String departmentName = "";
ArrayList<Employee> employeeList = new ArrayList<>();
ArrayList<Patient> patientList = new ArrayList<>();

public Department(String departmentName) {
	this.departmentName = departmentName;
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

void addPatient(Patient patient) {
	patientList.add(patient); 
}


void remove(Person person) throws RemoveException {
if(!(person instanceof Patient || person instanceof Employee))
	throw new RemoveException("No instance of this person is found in the registers");
	
	if (person instanceof Patient){
        if (patientList.contains(person)){
            patientList.remove(person);
            }
        else { throw new RemoveException("The patient does not contains "
        		+ "in the patient registers and couldnt be removed");
        }
        	
        }
    
    if (person instanceof Employee) {
    	if (employeeList.contains(person)){
            employeeList.remove(person);
            }
        else { throw new RemoveException("The employee does not contains "
        		+ "in the employee registers and couldnt be removed");
    }
    }
    
    //TODO: Add a success message
}
@Override
public String toString() {
    return "Department : " + departmentName + " " +
            "Employees : " + employeeList + " " +
            "Patients : " + patientList;
}
}