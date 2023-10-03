import java.util.List;

public class Question {
    private String question;
    private String type;
    private List<String> answer;

    public Question(String question, String type, List<String> answer){
        this.question = question;
        this.type = type;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public String getType(){
        return type;
    }

    public List<String> getAnswer(){
        return answer;
    }

}
