public class Student {
    private String id;
    private String answer;

    public Student(String id){
        this.id = id;
    }

    public void submit(String answer){
        this.answer = answer;
    }

    public String getId(){
        return id;
    }

    public String getAnswer(){
        return answer;
    }

}
