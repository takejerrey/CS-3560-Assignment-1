import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String args[]){
        List<String> studentAnswers = Arrays.asList("A","B","C","D");
        Question question = new Question("What is your answer?",
                                    "multiple choice", studentAnswers);
        VotingService votingService = new VotingService(question);
        //generate 20 students for poll
        int numStudents = 20;
        Random rand = new Random();

        for(int i = 0; i < numStudents;i++){
            String stuID = String.valueOf(rand.nextInt(500) % 199 + 100);
            Student student = new Student(stuID);

            String randomAnswer = studentAnswers.
                                    get(rand.nextInt(studentAnswers.size()));
            student.submit(randomAnswer);
            votingService.acceptSubmission(student,student.getAnswer());

        }
        votingService.displayResults();
    }
}
