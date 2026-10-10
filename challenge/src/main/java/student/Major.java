package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id = nextId ++ ;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;
    }
    public Major(){}

    // Method to add a student
    public void addStudent(Student s) {
        students[studentCount] = s ;
        studentCount ++;
        s.setMajor(this);
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the "+ name + " major is:");
        for(int i = 0 ; i < studentCount; i ++){
            System.out.println("\t" +(i+1) +". " + students[i].getCne() +" " + students[i].getFirstName() + " " +students[i].getSecondName());
        }
    }

    public Student findStudentByCNE(String cne){
        for(int i = 0 ; i < studentCount ; i ++ ){
            if(students[i].getCne() == cne){
                return students[i];
            }
        }
        return null;
    }
    public boolean removeStudent(String cne){
        Student s = findStudentByCNE(cne);
        if(s != null){
            for(int i = 0 ; i < studentCount ; i ++){
                if(students[i].getCne() == cne){
                    for(int j = i ; j< studentCount -1; j ++){
                        students[j] = students[j+1];
                    }
                    studentCount -- ;
                    break;
                }
            }
            s.setMajor(null);

            return true;
        }
        return false;
    }
    public void getOccupancyRate(){
        StringBuilder s = new StringBuilder();
        double occ = (double)studentCount / 50;
        s.append(this.name).append(" capacity : 50 student");
        s.append("\nCurrent enrollement : ").append(studentCount + " students");
        s.append("\nOccupancy rate = " + (occ) + "%");
        System.out.println(s);
    }
    public StringBuilder getStudentListAsString(){
        System.out.println("The list of students in the "+ name + " major is:");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < studentCount ; i ++ ){
            result.append((i+1) + ". " + students[i].getFullNameFormatted() + "\n");
        }
        return result;
    }


}
