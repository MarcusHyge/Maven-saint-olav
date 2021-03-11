
public class Patient extends Person implements Diagnosable {
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


void setDiagnose(String diagnosis) {

}

}