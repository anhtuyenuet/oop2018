package week1;

import java.util.*;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    ArrayList<Student> students = new ArrayList<>();
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup() == s2.getGroup();
        
    }

    void studentsByGroup() {
        // TODO:
        ArrayList<String> groups = new ArrayList<>();
        for(Student std : students){
            if(!groups.contains(std.getGroup())) groups.add(std.getGroup());
        }
        for(String gr : groups) {
            System.out.println(gr + ": ");
            for (Student std : students) {
                if (gr == std.getGroup()) {
                    System.out.println(std.getName());
                }
            }
        }
    }

    void removeStudent(String id) {
        for (Student std : students) {
            if(std.getId() == id ) {
                students.remove(std);
                break;
            }
        } 
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement sm = new StudentManagement();
        Student s1 = new Student("A","01","1@x.y");
        s1.setGroup("INT22042");
        Student s2 = new Student();
        Student s3 = new Student("C","03","3@x.y");
        Student s4 = new Student("D","04","4@x.y");
        s4.setGroup("INT22042");
        sm.students.add(s1);
        sm.students.add(s2);
        sm.students.add(s3);
        sm.students.add(s4);
        sm.studentsByGroup();
        System.out.println("****");
        //Xoa sv id = 01
        sm.removeStudent("01");
        sm.studentsByGroup();
    }
}
