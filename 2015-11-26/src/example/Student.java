// A very simple object that represents a student.
// demonstrates writing a more complex compareTo method

public class Student implements Comparable<Student> {
   private String name;
   private int id;
   private double gpa;

   // creates a student with the provided name, id and gpa.
   public Student(String name, int id, double gpa) {
      this.name = name;
      this.id = id;
      this.gpa = gpa;
   }
   
   // compares this student with another student. It first compares
   // by name then, if names are the same, by id then, if ids are the same,
   // by gpa. If all match it returns 0. Otherwise it returns a negative 
   // number if this is less than the other and positive otherwise. 
   public int compareTo(Student other) {
      if(!name.equals(other.name)) {
         return name.compareTo(other.name);
      } else if (id != other.id) {
         return id - other.id;
      } else {
         if(gpa < other.gpa) {
            return -1;
         } else if (gpa > other.gpa) {
            return 1;
         } else {
            return 0;
         }
      }
   }
}
