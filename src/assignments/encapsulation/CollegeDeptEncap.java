package assignments.encapsulation;

import java.util.Arrays;

public class CollegeDeptEncap {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        CollegeNDepartments collegeName1 = new CollegeNDepartments();
        CollegeNDepartments collegeName2 = new CollegeNDepartments();
        CollegeNDepartments collegeName3 = new CollegeNDepartments();
        CollegeNDepartments collegeName4 = new CollegeNDepartments();
        CollegeNDepartments collegeName5 = new CollegeNDepartments();
        //CollegeNDepartments departmentname = new  CollegeNDepartments();
        String[] department = new String[]{"IT", "CS", "MECH", "ECE", "EEE", "AERO", "AUTO", "EI"};

        //setting value of the data member
        collegeName1.setCollegeName("Srijayachamarajemndra Engineerinmg College, Mysore");
        collegeName2.setCollegeName("VidyaVikas College of Engineering, Mysore");
                collegeName3.setCollegeName("GSS, Mysore");
        collegeName4.setCollegeName("Vidyavardaka Engineering College, Mysore");
                collegeName5.setCollegeName("National Institute of ENGINEERING, Mysore");
        collegeName1.setDepartment(department);
        collegeName2.setDepartment(department);
        collegeName3.setDepartment(department);
        collegeName4.setDepartment(department);
        collegeName5.setDepartment(department);
        //getting value of the data member
        System.out.println(collegeName1.getCollegeName()+"   "+ Arrays.toString(collegeName1.getDepartment()));
        System.out.println(collegeName2.getCollegeName()+"   "+ Arrays.toString(collegeName2.getDepartment()));
        System.out.println(collegeName3.getCollegeName()+"   "+ Arrays.toString(collegeName3.getDepartment()));
        System.out.println(collegeName4.getCollegeName()+"   "+ Arrays.toString(collegeName4.getDepartment()));
        System.out.println(collegeName5.getCollegeName()+"   "+ Arrays.toString(collegeName5.getDepartment()));
    }
}
