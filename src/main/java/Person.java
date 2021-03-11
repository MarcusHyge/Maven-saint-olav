
public abstract class Person {
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

public String getLastName() {
	return this.lastName;
}

public String getFullNavn() {
	return this.firstName + this.lastName;
}

@Override
public String toString() {
    return "Firstname : " + firstName + " " +
    	   "Lastname : " + lastName + " " +
    		"Social Security Number : " + socialSecurityNumber;
}

/*public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name : ").append(this.firstName).append("\n");
        sb.append("Last name : ").append(this.lastName).append("\n");
        sb.append("Social Security Number : ").append(this.socialSecurityNumber).append("\n");
        return sb.toString();
    }
    */
}
