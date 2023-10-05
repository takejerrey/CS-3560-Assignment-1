import java.util.List;

public class Question {
    private String question;
    private String type;
    private List<String> answer;

    // set data fields
    public Question(String question, String type, List<String> answer){
        this.question = question;
        this.type = type;
        this.answer = answer;
    }

    //return question
    public String getQuestion(){
        return question;
    }

    // return type of question
    public String getType(){
        return type;
    }
    //return list of answers

    public List<String> getAnswer(){
        return answer;
    }

}
