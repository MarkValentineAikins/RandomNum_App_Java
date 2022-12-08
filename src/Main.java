import java.util.Random;
import java.util.Scanner;

/**
 * This program test your basic mathematical skills using Random class
 *
 */
public class Main {
    public static void main(String[] args) {

        int Num1;
        int Num2;
        int TotalNum;
        int userAnswer;
        char repeatNum;
        String input;

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        Num1 = rand.nextInt(20);
        Num2 = rand.nextInt(20);

        System.out.println("What is the answer to the " + " following problem?");
        System.out.println(Num1 + " + " + Num2 + " = ?");

        TotalNum = Num1 + Num2;

        userAnswer = scanner.nextInt();

        if (userAnswer == TotalNum)
            System.out.println("Correct answer");
        else {
            System.out.println("Sorry! "+ " Your maths is not correct, ");
            System.out.println("The correct answer is " + TotalNum);
        }
//        scanner.nextLine();
//
//        while (userAnswer !=TotalNum){
//            System.out.println("Try again...");
//            System.out.println(Num1 + " + " + Num2 + " = ?");
//
//            TotalNum = Num1 + Num2;
//
//            userAnswer = scanner.nextInt();
//
//            if (userAnswer == TotalNum)
//                System.out.println("Correct answer");
//            else {
//                System.out.println("Sorry! "+ " Your maths is not correct, ");
//                //System.out.println("The correct answer is " + TotalNum);
//                }
//
//        }
//        scanner.nextLine();
//        System.out.println("--------------------------------    ");
//        System.out.println("Do want to Test your mathematical skill again?");
//        System.out.println("Enter Y for Yes or N for No");
//        input = scanner.nextLine();
//        repeatNum = input.charAt(0);
//        do {
//
////            Scanner scanner = new Scanner(System.in);
////
////            Random rand = new Random();
//
//            Num1 = rand.nextInt(20);
//            Num2 = rand.nextInt(20);
//
//            System.out.println("What is the answer to the " + " following problem?");
//            System.out.println(Num1 + " + " + Num2 + " = ?");
//
//            TotalNum = Num1 + Num2;
//
//            userAnswer = scanner.nextInt();
//
//            if (userAnswer == TotalNum)
//                System.out.println("Correct answer");
//            else {
//                System.out.println("Sorry! "+ " Your maths is not correct, ");
//                //System.out.println("The correct answer is " + TotalNum);
//            }
//
//        }while (repeatNum == 'Y' || repeatNum == 'y');
//        scanner.nextLine();
//        System.out.println("--------------------------------    ");
//        System.out.println("Do want to Test your mathematical skill again?");
//        System.out.println("Enter Y for Yes or N for No");
//        input = scanner.nextLine();
//        repeatNum = input.charAt(0);
//        while (repeatNum == 'Y' || repeatNum == 'y'){
//            Num1 = rand.nextInt(20);
//            Num2 = rand.nextInt(20);
//            System.out.println("What is the answer to the " + " following problem?");
//            System.out.println(Num1 + " + " + Num2 + " =?");
//
//            TotalNum = Num1 + Num2;

    }

}