import java.util.List;

public class Question extends Student{
    private String question;
    private String type;
    private List<String> possibleAnswers;

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    // set data fields
    public Question(String question, String type){
        setQuestion(question);
        setType(type);
    }

    public Question(){
        setQuestion("Answer all that apply:");
        setType("Multiple Choice");
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question(String id) {
        super(id);
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

}
