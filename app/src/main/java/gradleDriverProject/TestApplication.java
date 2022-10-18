/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleDriverProject;
import java.util.ArrayList;
import gradleproject2.*; 
import gradleproject2.Module; 
import java.time.Clock;
/**
 *
 * @author Eoghan
 */
public class TestApplication {
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;
    
    public static void main(String[] args)
    {
        
        CourseProgramme c1 = new CourseProgramme("CS & IT");
        CourseProgramme c2 = new CourseProgramme("Civil Engineering");
        
        Module m1 = new Module("Software Engineering 3", "CT417");
        Module m2 = new Module("Information Retrieval", "CT4100");
        Module m3 = new Module("Machine Learning", "CT4101");
        Module m4 = new Module("Energy in Buildings", "CE466");
        Module m5 = new Module("Structural Analysis", "CE472");
        Module m6 = new Module("Project Management", "CE471");

        

        c1.assossiatedModules.add(m1);
        c1.assossiatedModules.add(m2);
        c1.assossiatedModules.add(m3);
        c2.assossiatedModules.add(m4);
        c2.assossiatedModules.add(m5);
        c2.assossiatedModules.add(m6);
        
        Student s1 = new Student("Mark Feehan", 21, 17852);
        Student s2 = new Student("James Broderick", 22, 15682);
        Student s3 = new Student("Paul Murray", 22, 15634);
        
        m1.students.add(s1);
        m1.students.add(s3);
        
        m2.students.add(s1);
        m2.students.add(s2);
        m2.students.add(s3);
        
        m3.students.add(s2);
        
        m4.students.add(s2);
        m4.students.add(s3);
        
        m5.students.add(s2);
        
        m6.students.add(s3);
        
        s1.courses.add(c1.getCourseName());
        s2.courses.add(c1.getCourseName());
        s2.courses.add(c2.getCourseName());
        s3.courses.add(c1.getCourseName());
        s3.courses.add(c2.getCourseName());
        
        s1.modules.add(m1.getModuleName());
        s1.modules.add(m2.getModuleName());
        s2.modules.add(m2.getModuleName());
        s2.modules.add(m3.getModuleName());
        s2.modules.add(m4.getModuleName());
        s2.modules.add(m5.getModuleName());
        s3.modules.add(m1.getModuleName());
        s3.modules.add(m2.getModuleName());
        s3.modules.add(m4.getModuleName());
        s3.modules.add(m6.getModuleName());
        
        
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);

        
    }
}
