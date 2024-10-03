package adapterDesinPattern;

public class SchoolStudent {

    private String firstName;
    private String lastName;
    private String emailId;

    public SchoolStudent(String firstName, String lastName, String emailId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailId(){
        return this.emailId;
    }
}
