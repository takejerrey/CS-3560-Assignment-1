import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String args[]){
        // list of answers
        List<String> studentAnswers = Arrays.asList("A","B","C","D");
        Question question = new Question("What is your answer?",
                                    "multiple choice", studentAnswers);
        //create voting service
        VotingService votingService = new VotingService(question);

        //create random object for creating random numbers
        Random rand = new Random();

        //randomly generate 1-50 students
        int numStudents = rand.nextInt(50) + 1;

        for(int i = 0; i < numStudents;i++){

            // generate random student id from 100-199
            String stuID = String.valueOf(rand.nextInt(100) + 100);
            Student student = new Student(stuID);

            // generate & submit an answer from the list initialized at beginning
            String randomAnswer = studentAnswers.
                                    get(rand.nextInt(studentAnswers.size()));

            student.submit(randomAnswer);
            votingService.acceptSubmission(student,student.getAnswer());

        }
        // output how many times each answer was chosen
        votingService.displayResults();
    }
}
