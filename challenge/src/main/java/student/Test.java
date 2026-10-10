package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students
        Student s1 = new Student("Raziki" , "Ahmed", "212658497653","RazikiAhmed@gmail.com","26252398");
        Student s2 = new Student("Badouzi" ,"Lina","212687569843","BadouziLina@gmail.com","22689751");

        Major cs = s1.getMajor();
        cs.displayStudents();

        Major m1 = new Major("22", "Architecture");
        Major m2 = new Major("21" ,"Mechanical");

        Student s3 = new Student("Sabiri" , "Saad" , "212658479865","SabiriSaad@gmail.com" ,"23597489",m1);
        Student s4 = new Student("Diani" , "Douae" , "212698754612","DianiDouae@gmail.com","27231546",m1);
        Student s5 = new Student("Bennani", "Youssef", "212612345678", "BennaniYoussef@gmail.com", "24891234", m2);
        Student s6 = new Student("El Amrani", "Salma", "212698123456", "ElAmraniSalma@gmail.com", "25987412");
        m2.addStudent(s6);

        System.out.println("\nThe major of " + s6.getFullNameFormatted() + " is : " + s6.getMajor().getName());
        System.out.println();

        m1.displayStudents();
        m2.displayStudents();

        System.out.println("\nStudent found in "+ m2.getName() +" major : " + m2.findStudentByCNE("24891234"));
        m1.removeStudent(s4.getCne());

        System.out.println();
        m1.displayStudents();

        System.out.println("The number of students in " + m2.getStudentCount() + " is :" + m1.getStudentCount());
        System.out.println();

        m2.getOccupancyRate();
        System.out.println();

        System.out.println(m2.getStudentListAsString());


    }
}

