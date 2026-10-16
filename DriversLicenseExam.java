import java.util.Scanner;
public class DriversLicenseExam {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String[] exam = {"A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};
        String[] answer = new String[20];
        //int i;
        int correct = 0;
        int incorrect = 0;
        String question = "";

        System.out.println("Only use 'A', 'B', 'C', or 'D' for your answers.");

        for(int i=0; i<answer.length; i++){
            System.out.print("Enter your answer for Question "+(i+1)+": ");
            answer[i] = input.nextLine();

            if(!answer[i].equalsIgnoreCase("A")){
                if(!answer[i].equalsIgnoreCase("B")){
                    if(!answer[i].equalsIgnoreCase("C")){
                        if(!answer[i].equalsIgnoreCase("D")){
                            System.out.println("That answer is not accepted.");
                            System.out.print("Enter your answer for Question "+(i+1)+": ");
                            answer[i] = input.nextLine();
                        }
                    }
                }
            }
        }

        for(int i=0; i<answer.length; i++){
            if(answer[i].equalsIgnoreCase(exam[i])){
                correct++;
            }

            if(!answer[i].equalsIgnoreCase(exam[i])){
                incorrect++;
                question = question+(i+1)+" ";
                
            }
        }

        int score = 20 - incorrect;

        if(score == 20){
            System.out.println("Congratulations, you passed the test with a perfect score!");
            System.out.println("Correct: "+correct);
            System.out.println("Incorrect: "+incorrect);
            System.out.print("Questions Missed: "+question);
        }

        if(score >= 15 && score < 20){
            System.out.println("Congratulations, you have passed the test.");
            System.out.println("Correct: "+correct);
            System.out.println("Incorrect: "+incorrect);
            System.out.print("Questions Missed: "+question);
        }

        if(score < 15){
            System.out.println("Unfortunately, you did not pass the test.");
            System.out.println("Correct: "+correct);
            System.out.println("Incorrect: "+incorrect);
            System.out.print("Questions Missed: "+question);
        }
    }
}
