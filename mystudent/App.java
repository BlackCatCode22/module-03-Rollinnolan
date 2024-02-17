package mystudent;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Hello from class App \n\n");

        // Create a student object
        Student myStudent1 = new Student();

        // Fill the new myStudent object's data fields
        myStudent1.firstName = "Nolan";
        myStudent1.lastname = "Barrett";
        myStudent1.age = 21;
        myStudent1.idNumber = 1234567;
        myStudent1.gpa = 3.7;
        myStudent1.major = "Computer Science";
        myStudent1.city = "Fresno";
        myStudent1.year = "sophomore";

        Student myStudent2 = new Student();

        myStudent2.firstName = "Ryan";
        myStudent2.lastname = "Reynolds";
        myStudent2.age = 47;
        myStudent2.idNumber = 7654321;
        myStudent2.gpa = 3.2;
        myStudent2.major = "Deadpool";
        myStudent2.city = "New York City";
        myStudent2.year = "unknown";

        profile(myStudent1);
        profile(myStudent2);
    }

    public static int profile(Student student)
    {
        System.out.println("The first name of the student is: " + student.firstName );
        System.out.println("The last name of the student is: " + student.lastname );
        System.out.println("Age: " + student.age );
        System.out.println("ID: " + student.idNumber );
        System.out.println("Major: " + student.major );
        System.out.println("city: " + student.city );
        System.out.println("year: " + student.year + "\n");
        System.out.println("====================================================");
        return 0;
    }

}
