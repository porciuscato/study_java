public class ManageStudent{
  public static void main(String[] args){
    Student[] student = null;
    student = addStudent();
    printStudents(student);
    }
    
  public static Student[] addStudent(){
    Student[] student = new Student[3];
    student[0] = new Student("Lim");
    student[1] = new Student("Min");
    student[2] = new Student("Sang", "Seoul", "010", "ask@god.com");
    return student;
    }

  public static void printStudents(Student[] students){
    for(Student student:students) {
      System.out.println(student);
    //  System.out.println(student.name +  " " + student.address + " " + student.phone + " " + student.email);
      }
    }
  }