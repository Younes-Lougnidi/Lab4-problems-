package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public Subject(){}
    public Subject(int id , String code , String title){
        this.id = id;
        this.code = code;
        this.title = title;
    }

    // implementing the getters and setters in case we need them
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String normalizedCode(){
        return code.toUpperCase().trim();
    }
    public String properTitle(){
        String[] words = title.split(" ");
        for(int i = 0 ; i < words.length ; i ++ ){words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);}
        return String.join(" " , words);
    }

    public boolean isIntroCourse(){
        if(code.toUpperCase().substring(0,6).equals("INTRO-")){
            return true;
        }
        return false;
    }
    public String syllabusLine(Instructor ins){
        StringBuilder str = new StringBuilder();
        str.append(code).append(" - ").append(title);
        str.append(" (Instructor: ").append(ins.displayName()).append(")");
        return str.toString();
    }
}
