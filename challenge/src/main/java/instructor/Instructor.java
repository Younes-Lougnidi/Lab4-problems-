package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
    }
    public Instructor(){}
    // implementing the getters and setters in case we need them
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String cleanEmployeeNumber(){
        return employeeNumber.trim().replace(" ", "");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, this.firstName,this.secondName);
    }
    public String toCard(){
        StringBuilder result = new StringBuilder();
        result.append("Instructor").append("\n----------");
        result.append("\nEmployee #: ").append(employeeNumber);
        result.append("\nName\t: ").append(secondName).append(", ").append(firstName);
        result.append("\nEmail\t: ").append(email);
        result.append("\nPhone\t: ").append(phone);
        return result.toString();
    }
    public String displayName(){
        StringBuilder str = new StringBuilder();
        if(firstName == null){
            str.append(secondName);
        }
        if(secondName == null){
            str.append(firstName);
        }
        if(firstName != null && secondName != null){
            str.append(secondName).append(" ").append(firstName);
        }
        return str.toString();
    }


}
