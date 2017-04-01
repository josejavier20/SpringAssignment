/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jose Javier Silva Ra
 */
@Component
public class Student {
    private String firstName;
    private String lastName;
    private String DoB;
    @Autowired
    private Address address;
    @Autowired
    private Grade grade;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
    
    @Override
    public String toString(){
        return "Student [ First Name: "+firstName+" Last Name: "
                +lastName+" Date of Birth: "+DoB+" "+address+" "+grade+"]";
//        return "Student [ Information: "+students+" Address information: "+address+"  Gr"+grade+"]";
    }
}
