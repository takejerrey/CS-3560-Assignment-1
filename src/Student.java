public class Student {
    private String id;
    private String answer;

    /// set ID
    public Student(String id){
        setId(id);
    }
    public Student(){
        setId("-1");
    }

    public void setId(String id) {
        this.id = id;
    }

    //set answer
    public void setAnswer(String answer){
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
