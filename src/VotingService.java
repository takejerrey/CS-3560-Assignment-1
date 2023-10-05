import java.util.HashMap;
import java.util.List;
import java.util.Map;

//subclass of Question, which is a subclass of Student
public class VotingService extends Question {
    //set data field, a map for the final student id and final answer
    private Map<String, String> answer;

    // set data fields, make answer a hashmap
    public VotingService(String type) {
        setType(type);
        answer = new HashMap<>();
    }

    // accept student id and answer, use hashmap to ensure one answer perstudent
    public void acceptSubmission(String answer) {
            this.answer.put(this.getId(), answer);

    }

    // display answers to user
    public void displayResults() {
        Map<String, Integer> count = new HashMap<>();
        List<String> answers = this.getPossibleAnswers();

        //initialize count for all answers
        for (String answer : answers) {
            count.put(answer, 0);
        }
        for (String answer : answer.values()) {
            count.put(answer, count.get(answer) + 1);
        }
        for (String answer : answers) {
            System.out.println(answer + ": " + count.get(answer));
        }
    }

}
