import java.util.Scanner;
import java.util.Random;
public class RPS
{
  public static void main(String[] args) {
    int userScore=0;
    int computerScore=0;
    int userChoice;
    int computerChoice;
    String choice;
    Scanner input = new Scanner (System.in);
    boolean restart=true;
    Random computer= new Random();

    while (restart){
      while(true){
        System.out.println("\nrock, paper, scissors?");
        choice = input.nextLine();
        if(choice.equalsIgnoreCase("rock")){
          userChoice=1;
          break;
        }
        else if(choice.equalsIgnoreCase("paper")){
          userChoice=2;
          break;
        }
        else if(choice.equalsIgnoreCase("scissors")){
          userChoice=3;
          break;
        }
        else{
          System.out.println("Invalid input. Make sure your input is spelled correctly");
        }
      }
      computerChoice = computer.nextInt(3)+1;
      switch(computerChoice){
        //rock=1, paper=2, scissors=3;
        case 1: if(userChoice==1){//rock
                  System.out.println("\n1...2...3...\ncomputer: rock\nuser: rock\n");
                  System.out.println("You tied!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==2){
                  userScore++;
                  System.out.println("\n1...2...3...\ncomputer: rock\nuser: paper\n");
                  System.out.println("You won!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==3){
                  computerScore++;
                  System.out.println("\n1...2...3...\ncomputer: rock\nuser: scisscors\n");
                  System.out.println("You lost!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
        case 2: if(userChoice==1){//paper
                  computerScore++;
                  System.out.println("\n1...2...3...\ncomputer: paper\nuser: rock\n");
                  System.out.println("You lost!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==2){
                  System.out.println("\n1...2...3...\ncomputer: paper\nuser: paper\n");
                  System.out.println("You tied!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==3){
                  userScore++;
                  System.out.println("\n1...2...3...\ncomputer: paper\nuser: scisscors\n");
                  System.out.println("You won!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
        case 3: if(userChoice==1){//scissors
                  userScore++;
                  System.out.println("\n1...2...3...\ncomputer: scissors\nuser:rock\n");
                  System.out.println("You won!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==2){
                  computerScore++;
                  System.out.println("\n1...2...3...\ncomputer: scissors\nuser: paper\n");
                  System.out.println("You lost!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
                else if(userChoice==3){
                  System.out.println("\n1...2...3...\ncomputer: scissors\nuser: scissors\n");
                  System.out.println("You tied!");
                  System.out.println("\nThe score is: \nComputer: "+computerScore+"\nUser: "+userScore);
                  break;
                }
      }
      System.out.println("Go again? (y or n)\n");
      while (true){
        choice=input.nextLine();
        if(choice.equalsIgnoreCase("y")){
          break;
        }
        else if (choice.equalsIgnoreCase("n")){
          restart=false;
          System.out.println("\nThe final score is: \nComputer: "+computerScore+"\nUser: "+userScore);
          break;
        }
        else{
          System.out.println("Sorry?:\n");
        }
      }
    }
  }
}
