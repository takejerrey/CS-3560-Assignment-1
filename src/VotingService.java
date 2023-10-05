import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingService extends Question {
    private Map<String, String> answer;
    private Question question;

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
        for (String a : answers) {
            count.put(a, 0);
        }
        for (String a : answer.values()) {
            count.put(a, count.get(a) + 1);
        }
        for (String a : answers) {
            System.out.println(a + ": " + count.get(a));
        }
    }

}
