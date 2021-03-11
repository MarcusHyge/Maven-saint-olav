
public class Patient extends Person implements Diagnosable {
	Patient(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

String diagnosis = "";

String getDiagnose() {
	return diagnosis;
}

@Override
public String toString() {
    return "Diagnosis : " + diagnosis;
}


@Override
public void setDiagnosis(String diagnosis) {
	// TODO Auto-generated method stub
	}
}