package Others;

import java.util.*;

/**
 * Created by varun on 4/21/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}

class Solution {

    public static int getCommanStudents(Student[] course1, Student[] course2){

        Set<Student> set1 = new HashSet<>(Arrays.asList(course1));
        Set<Student> set2 = new HashSet<>();

        for(Student s : course2){
            if(set1.contains(s)) set2.add(s);
        }
        System.out.println(set2.size());
        return set2.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("bhavik","bhavsar",26);
        Student s2 = new Student("bhavu","bhavsar",23);
        Student s3 = new Student("bhavumal","bhavsar",25);

        Student[] course1 = {s1,};
        Student[] course2 = {s2,s3};

        getCommanStudents(course1,course2);

    }
}