// suepr class of Question and VotingService
public class Student {
    //data fields for student id and answer
    private String id;
    private String answer;

    /// set ID
    public Student(String id){
        setId(id);
    }
    //defualt constructor for student suepr class, set id to -1, symbolizing no
    // student
    public Student(){
        setId("-1");
    }

    //set id
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
