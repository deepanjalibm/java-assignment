package assignments.encapsulation;

public class CollegeNDepartments {
    //private data member
    private String collegeName;
    public String[] department;

    //Getter setter method
    public String getCollegeName(){
        return collegeName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    public String[] getDepartment(){
        return department;
    }
    public void setDepartment(String[] department){
        this.department = department;
    }
}
