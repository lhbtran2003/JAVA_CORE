package bai7;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
   public static void main(String[] args) {
       List<Student> studentList = new ArrayList<>();
       studentList.add(new Student("Tran", "123", 4.0));
       studentList.add(new GraduateStudent("Chi", "456", 3.0, "AI", "Hùng"));

       for (Student student : studentList) {
           if (student instanceof GraduateStudent) {
               student.getDetails();
           }
          else {
              student.getDetails();
           }
       }
   }

}
