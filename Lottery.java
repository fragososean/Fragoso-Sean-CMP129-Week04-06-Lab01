import java.util.Scanner;
import java.util.Random;
public class Lottery {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int[] lottery = new int[5];
        int[] user = new int[5];
        int win = 0;
        int lose = 0;

        for(int i=0; i<lottery.length; i++){
            lottery[i] = generator.nextInt(10);
        }
        
        for(int i=0; i<user.length; i++){
            System.out.print("Enter Lottery No. "+(i+1)+": ");
            user[i] = input.nextInt();
        }

        for(int i=0; i<lottery.length; i++){
            if(user[i] == lottery[i]){
                win++;
            }

            if(user[i] != lottery[i]){
                lose++;
            }
        }

        System.out.print("\n");

        System.out.println("Lottery Numbers: ");
        for(int i=0; i<lottery.length; i++){
            System.out.print(lottery[i]+"\t");
        }
        
        System.out.println("\nYour Numbers: ");
        for(int i=0; i<user.length; i++){
            System.out.print(user[i]+"\t");
        }
        
        System.out.println("\n");

        if(win==5){
            System.out.print("Congratulations, all numbers match!");
        }

        else if(lose==5){
            System.out.print("Sorry, but none of your numbers match.");
        }

        else{
            System.out.print(win+" of your numbers match.");
        }

    }
}