/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringAssignment;

import org.springframework.stereotype.Component;

/**
 *
 * @author Jose Javier Silva Ra
 */
@Component
public class Grade {
 private String subject;
 private char grade;
 
    @Override
    public String toString(){
        return "Grade [Subject: "+subject+" grade: "+grade+"]";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
