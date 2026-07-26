import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];


    QuestionService() {
        int index = 0;
        for (Question q : questions) {
            questions[index] = new Question(index + 1, "Q no", "opt", "opt", "opt", "opt", "opt");
            index++;
        }
    }

    public void playQuiz() {
        int index = 0;
        for (Question q : questions) {

            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[index] = sc.nextLine();

            index++;
        }

        System.out.println("___ Your Answers ____");

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String rightAnswer = question.getAnswer();
            String userAnswer = selection[i];

            if(rightAnswer.equals(userAnswer))
                score++;
        }

        System.out.println("_____ Your Score _____");

        System.out.println(score + " / "+ questions.length);
    }
}