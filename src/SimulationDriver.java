import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String args[]){
        // declare list of possible answers for multiple and single choiec question
        List<String> multipleChoiceAnswers = Arrays.asList("A","B","C","D");
        List<String> singleChoiceAnswers = Arrays.asList("True", "False");

        // declare subclass VotingService for both answer types
        VotingService multipleChoice = new VotingService("Multiple Choice");
        VotingService singleChoice = new VotingService("Single Choice");

        // set list of answers
        multipleChoice.setPossibleAnswers(multipleChoiceAnswers);
        singleChoice.setPossibleAnswers(singleChoiceAnswers);

        //generate random number for number of students
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

        // single choice run, only one answer per question per student
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
