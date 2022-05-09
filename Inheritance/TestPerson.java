package Inheritance;

public class TestPerson {
    public static void main(String[] args) {
        Student s1 =new Student("Tan Ah ","1 happy Ave");
        s1.addCourcsesGrade("IM101",97);
        s1.addCourcsesGrade("IM102",68);
        s1.printGrades();
        System.out.println("Average is : "+s1.getAverageGrade());

        Teacher t1 =new Teacher("PAul tan","8 sunset away");
        System.out.println(t1);
        String[] courses = {"IM101","IM102","IM101"};
        for (String course: courses){
            if (t1.addCourses(course)){
                System.out.println(course + "adder");
            }else {
                System.out.println(course + " cannot be added");
            }
        }
        for (String course: courses){
            if (t1.removeCourses(course)){
                System.out.println(course + "removed");
            }else {
                System.out.println(course +"cannot be removed");
            }
        }
    }
}
