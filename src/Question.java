import java.util.List;
//subclass of Student, superclass of VotingService
public class Question extends Student{
    // data fields for the question, the type fo question, and the list of answers
    private String question;
    private String type;
    private List<String> possibleAnswers;

    //set possible answers
    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    // return the list of possible answers
    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    //defauly constructor
    public Question(){
        setQuestion("Answer all that apply:");
        setType("Multiple Choice");
    }

    //set the type of question
    public void setType(String type) {
        this.type = type;
    }

    //set the question
    public void setQuestion(String question) {
        this.question = question;
    }

    //return question
    public String getQuestion(){
        return question;
    }

    // return type of question
    public String getType(){
        return type;
    }

}
