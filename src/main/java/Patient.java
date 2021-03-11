
public class Patient extends Person {
Patient(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

String diagnosis = "";

String getDiagnose() {
	return diagnosis;
}

String toString(String a) {
	return a;
};


void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
}