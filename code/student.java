import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Represents a student applying to the university
class Student {
 private String name;
 private int age;
 private String email;

 public Student(String name, int age, String email) {
     this.name = name;
     this.age = age;
     this.email = email;
 }

 public String getName() { return name; }
 public int getAge() { return age; }
 public String getEmail() { return email; }
}