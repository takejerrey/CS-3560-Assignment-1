import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String args[]){
        // list of answers
        List<String> studentAnswers = Arrays.asList("A","B","C","D");
        List<String> trueFalseAnswers = Arrays.asList("True", "False");
        //two types of questions
        Question question = new Question("What is your answer?",
                                    "multiple choice", studentAnswers);
        Question trueFalse = new Question("Answer True False:",
                                    "true or false", trueFalseAnswers);
        //create voting service
        VotingService votingService = new VotingService(question);
        VotingService trueFalseService = new VotingService(trueFalse);

        //create random object for creating random numbers
        Random rand = new Random();

        //randomly generate 20-50 students
        int numStudents = rand.nextInt(30) + 20;

        // generate results for multiple choice questions
        for(int i = 0; i < numStudents;i++){

            // generate random student id from 100-199
            String stuID = String.valueOf(i + 1);
            Student student = new Student(stuID);

            // generate & submit an answer from the list initialized at beginning
            String randomAnswer = studentAnswers.
                                    get(rand.nextInt(studentAnswers.size()));

            student.submit(randomAnswer);
            votingService.acceptSubmission(student,student.getAnswer());

        }
        // output results
        votingService.displayResults();

        // generate results for true false questions
        for(int i = 0; i < numStudents;i++){

            // generate random student id from 100-199
            String stuID = String.valueOf(i + 1);
            Student student = new Student(stuID);

            // generate & submit an answer from the list initialized at beginning
            String randomAnswer = trueFalseAnswers.
                    get(rand.nextInt(trueFalseAnswers.size()));

            student.submit(randomAnswer);
            trueFalseService.acceptSubmission(student,student.getAnswer());

        }
        // output results
        trueFalseService.displayResults();
    }
}
