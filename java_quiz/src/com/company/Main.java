package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String q1 = "Quanto eh 2 + 2?\n"
                  + "(a)4\n(b)6\n(c)10\n";

        String q2 = "Quanto eh 10 x 2?\n"
                  + "(a)30\n(b)40\n(c)20\n";

        String q3 = "Quanto eh 10 / 2?\n"
                + "(a)5\n(b)4\n(c)2\n";

        String q4 = "Quanto eh 10 + 20?\n"
                + "(a)30\n(b)60\n(c)10\n";

        String q5 = "Quanto eh 100 x 13?\n"
                + "(a)1300\n(b)40\n(c)20\n";

        String q6 = "Quanto eh 50 / 2?\n"
                + "(a)25\n(b)10\n(c)20\n";

        String q7 = "Quanto eh 20 + 2?\n"
                + "(a)32\n(b)22\n(c)42\n";

        String q8 = "Quanto eh 10 x 30?\n"
                + "(a)30\n(b)40\n(c)300\n";

        String q9 = "Quanto eh 100 / 2?\n"
                + "(a)50\n(b)4\n(c)2\n";

        String q10 = "Quanto eh 40 + 7?\n"
                + "(a)5\n(b)47\n(c)2\n";

        /* criou matriz de perguntas */
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "c"),
                new Question(q3, "a"),
                new Question(q4, "a"),
                new Question(q5, "a"),
                new Question(q6, "a"),
                new Question(q7, "b"),
                new Question(q8, "c"),
                new Question(q9, "a"),
                new Question(q10, "b"),

        };
        takeTest(questions);


    }

    /* dentro desse metodo pega todas as perguntas e pergunta o usuario perguntas individuais e se responde certo ou errado inclui a variavel que mantem o rastreamento dos pontos */
    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }

        }
        System.out.println("Voce conseguiu " + score + "/" + questions.length + "pontos");

    }

}
