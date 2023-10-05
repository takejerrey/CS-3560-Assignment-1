import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String args[]){
        List<String> multipleChoiceAnswers = Arrays.asList("A","B","C","D");
        List<String> singleChoiceAnswers = Arrays.asList("True", "False");

        VotingService multipleChoice = new VotingService("Multiple Choice");
        multipleChoice.setPossibleAnswers(multipleChoiceAnswers);
        VotingService singleChoice = new VotingService("Single Choice");
        singleChoice.setPossibleAnswers(singleChoiceAnswers);

        Random rand = new Random();
        int numStudents = rand.nextInt(30) + 20;
        // multiple choice run, assume each student enters 3 choices
        for(int i = 0; i < numStudents * 3;i++){
            multipleChoice.setId("" + i);
            multipleChoice.setQuestion("Answer All That Apply:");
            String randomAnswer = multipleChoiceAnswers.get(rand.nextInt(multipleChoiceAnswers.size()));
            multipleChoice.setAnswer(randomAnswer);
            multipleChoice.acceptSubmission(multipleChoice.getAnswer());
        }
        multipleChoice.displayResults();

        // single choice run
        for(int i = 0; i < numStudents;i++){
            singleChoice.setId("" + i);
            multipleChoice.setQuestion("Select True or False:");
            String randomAnswer = singleChoiceAnswers.get(rand.nextInt(singleChoiceAnswers.size()));
            singleChoice.setAnswer(randomAnswer);
            singleChoice.acceptSubmission(singleChoice.getAnswer());
        }

        singleChoice.displayResults();
    }
}
