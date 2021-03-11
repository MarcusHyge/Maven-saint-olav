
public class Person {
String firstName;
String lastName;
String socialSecurityNumber; 

Person (String firstName, String lastName, String socialSecurityNumber) {
	this.firstName = firstName;
	this.lastName= lastName; 
	this.socialSecurityNumber = socialSecurityNumber;
}

public String getPersonnnummer() {
	return this.socialSecurityNumber;
}

void setPersonnummer(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

void setFirstName(String firstName) {
	this.firstName = firstName;
}

void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getFirstName() {
	return this.firstName;
}

public String getFullNavn() {
	return this.firstName;
}

}