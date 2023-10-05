import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingService {
   private Map<String, String> answer;
   private Question question;

   String correctAnswer;

   // set data fields, make answer a hashmap
   public VotingService(Question question){
       this.question = question;
       answer = new HashMap<>();
   }

    // accept student id and answer, use hashmap to ensure one answer perstudent
   public void acceptSubmission(Student student, String answer){
       this.answer.put(student.getId(),answer);
   }

   // display answers to user
   public void displayResults(){
       Map<String, Integer>count = new HashMap<>();
       List<String> answers = question.getAnswer();

       //initialize count for all answers
       for(String a: answers){
           count.put(a,0);
       }
       for(String a: answer.values()){
           count.put(a,count.get(a) + 1);
       }
       for(String a: answers){
           System.out.println(a + ": " +count.get(a));
       }
   }

}
