public class Student {
    private String id;
    private String answer;

    /// set ID
    public Student(String id){
        this.id = id;
    }

    //set answer
    public void submit(String answer){
        this.answer = answer;
    }

    //return ID
    public String getId(){
        return id;
    }

    //return answer
    public String getAnswer(){
        return answer;
    }

}
