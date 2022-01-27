import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userCounter = 0;

        System.out.println("You have to guess a random number from 1 to 100 \n" +
                "if you guess you win, you have 10 attempts");

        Scanner scanner = new Scanner(System.in);

        int cpuNum = 1 + (int) (Math.random() * 100);
        System.out.println("What's a num ???");

        while (true){
            System.out.println("Enter your number: ");
            int num = scanner.nextInt();

            if (num == cpuNum){
                System.out.println("Great you win!!!");
                break;
            }else if(num > cpuNum){
                System.out.println("Your number is higher");
            }else if( num < cpuNum){
                System.out.println("Your number is less");
            }
            userCounter++;
            if (userCounter == 10){
                System.out.println("Sorry you lose :(");
                break;
            }
        }
    }
}
