package instructor;

public class Test {
    public static void main(String[] args) {
        Instructor ins1 = new Instructor("Yassine", "Benjelloun", "212661234567", "YassineBenjelloun@gmail.com", "AB 1024 ");
        Instructor ins2 = new Instructor("Nadia", "Tahiri", "212678912345", "NadiaTahiri@gmail.com", "AB 2048");

        Subject sub1 = new Subject(1, "intro-cs101", "introduction to computer science");
        Subject sub2 = new Subject(2, "cs-101", "linear algebra");

        System.out.println(ins1.cleanEmployeeNumber());
        System.out.println();

        System.out.println(sub1.normalizedCode());
        System.out.println(sub2.normalizedCode());
        System.out.println();

        System.out.println(sub1.properTitle());
        System.out.println(sub2.properTitle());
        System.out.println();

        System.out.println(ins1.summaryLine());
        System.out.println(ins2.summaryLine());
        System.out.println();

        System.out.println("Is the course " + sub1.properTitle() + "an introductory course? "+sub1.isIntroCourse());
        System.out.println("Is the course " + sub2.properTitle() + "an introductory course? "+sub2.isIntroCourse());
        System.out.println();

        System.out.println(ins1.toCard());
        System.out.println();

        System.out.println(sub1.syllabusLine(ins1));
        System.out.println(sub2.syllabusLine(ins2));
        System.out.println();

        System.out.println(ins1.displayName());
        Instructor ins3 = new Instructor(null, "Alami", "212600000000", "alami@univ.ma", "EMP3000");
        System.out.println(ins3.displayName());
    }

}
