/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringAssignment.Manager;

import SpringAssignment.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jose Javier Silva Ra
 */
public class StudentManager {
    public static void main(String[]args){
    ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringDao.xml"});
    
    Student bean = (Student) context.getBean("student");
    System.out.println(bean);
    }
}
