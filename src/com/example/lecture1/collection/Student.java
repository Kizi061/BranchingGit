package com.example.lecture1.collection;

import java.util.UUID;
import java.util.Objects;

public class Student {

    private String studentID;
    private String studentName;



    public Student( String studentID , String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
       // this.department = new Department( "Computer" );
    }

    public String getStudentID() {
        return UUID.randomUUID().toString();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // hashcode

//    @Override
//    public int hashCode() {
//        return 2;
//    }

        @Override
    public int hashCode() {
        return Objects.hash(studentID, studentName);
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;

       Student student = (Student) obj;
       return studentID.equals( student.studentID) && studentName.equals( student.studentName );

    }
//    }


}
