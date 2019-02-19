/**
 * Auto Generated Java Class.
 */
import java.util.Random;
import java.util.Scanner;

public class Chp5 
{

  public static void main(String[] args)
  {
    int draw1, draw2, draw3, draw4, draw5, draw6;
    //The variables for the user chosen numbers
    int choice1, choice2, choice3, choice4, choice5, choice6;

    /* The next blocks of code have to do with the drawing of numbers.
     * Their functions will be to verify that there are no duplicate drawn numbers.
     * They will also verify that the numbers are not zero.
     */
    Random gen = new Random();

    draw1 = gen.nextInt(60)+1;
    draw2 = gen.nextInt(60)+1;
    draw3 = gen.nextInt(60)+1;
    draw4 = gen.nextInt(60)+1;
    draw5 = gen.nextInt(60)+1;
    draw6 = gen.nextInt(60)+1;
    
    //Will check if its a duplicate. 
    while(draw2 == draw1)
    {
      draw2 = gen.nextInt(60)+1;
    }
    while((draw3 == draw1) || (draw3 == draw2))
    {
      draw3 = gen.nextInt(60)+1;
    }
    while((draw4 == draw1) || (draw4 == draw2)|| (draw4 == draw3))
    {
      draw3 = gen.nextInt(60)+1;
    }
    draw5 = gen.nextInt(60)+1;
    while((draw5 == draw1) || (draw5 == draw2)|| (draw5 == draw3) || (draw5 == draw4))
    {
      draw3 = gen.nextInt(60)+1;
    }
    while((draw6 == draw1) || (draw6 == draw2)|| (draw6 == draw3) || (draw6 == draw4) || (draw6 == draw5))
    {
      draw3 = gen.nextInt(60)+1;
    }
    
   /* The Following code will handle user input in the following ways...
    * It will handle the user picking numbers.
    * It will check duplicates numbers.
    */
   Scanner scan = new Scanner(System.in);
   //Greets the user to the lottery game.
   System.out.println("Welcome to the Generic Lottery Game!");
   System.out.println("You have a chance at winning millions! Millions!!!");
   System.out.println("The rules are that you enter 6 numbers. They have to be between 1-60.");
   //Calls for the user to input their number choices
   System.out.println("Please enter your first number.");
   choice1 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice1 > 0) || !(choice1 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice1 = scan.nextInt();
   }
   System.out.println("User numbers: "+choice1);
   System.out.println("Please enter your second number.");
   choice2 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice2 > 0) || !(choice2 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice2 = scan.nextInt();
   }
   //Checks for duplicate choices.
   while(choice2 == choice1)
   {
     System.out.println("Invalid choice, please choice another number thats not similar to your other choices.");
     choice2 = scan.nextInt();
   }
   
   System.out.println("User numbers: "+choice1+" "+choice2);
   System.out.println("Please enter your third number.");
   choice3 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice3 > 0) || !(choice3 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice3 = scan.nextInt();
   }
   //Checks for duplicate choices.
   while((choice3 == choice1) || (choice3 == choice2))
   {
     System.out.println("Invalid choice, please choice another number thats not similar to your other choices.");
     choice3 = scan.nextInt();
   }
   
   System.out.println("User numbers: "+choice1+" "+choice2+" "+choice3);
   System.out.println("Please enter your fourth number.");
   choice4 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice4 > 0) || !(choice4 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice4 = scan.nextInt();
   }
   //Checks for duplicate choices.
   while((choice4 == choice1) || (choice4 == choice2) || (choice4 == choice3))
   {
     System.out.println("Invalid choice, please choice another number thats not similar to your other choices.");
     choice4 = scan.nextInt();
   }
   System.out.println("User numbers: "+choice1+" "+choice2+" "+choice3+" "+choice4);
   System.out.println("Please enter your fifth number.");
   choice5 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice5 > 0) || !(choice5 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice5 = scan.nextInt();
   }
   //Checks for duplicate choices.
   while((choice5 == choice1) || (choice5 == choice2) || (choice5 == choice3) || (choice5 == choice3)|| (choice5 == choice4))
   {
     System.out.println("Invalid choice, please choice another number thats not similar to your other choices.");
     choice5 = scan.nextInt();
   }
   System.out.println("User numbers: "+choice1+" "+choice2+" "+choice3+" "+choice4+" "+choice5);
   System.out.println("Please enter your sixth number.");
   choice6 = scan.nextInt();
   //Verifies if the number is between 1 and 60
   while(!(choice6 > 0) || !(choice6 < 61))
   {   
     System.out.println("Invalid choice, Please enter a number between 0 and 60");
     choice6 = scan.nextInt();
   }
   //Checks for duplicate choices.
   while((choice6 == choice1) || (choice6 == choice2) || (choice6 == choice3) || (choice6 == choice3)|| (choice6 == choice4) || (choice6 == choice5))
   {
     System.out.println("Invalid choice, please choice another number thats not similar to your other choices.");
     choice6 = scan.nextInt();
   }
   System.out.println("User numbers: "+choice1+" "+choice2+" "+choice3+" "+choice4+" "+choice5+" "+choice6);
   System.out.println("Drawn numbers: "+draw1+" "+draw2+" "+draw3+" "+draw4+" "+draw5+" "+draw6);
   
  //Prize amount will be determined by the level.
  //Each match = 1 level up 
  int level = 0;
  if((choice6 == draw1) || (choice6 == draw2) || (choice6 == draw3) || (choice6 == draw3)|| (choice6 == draw4) || (choice6 == draw5) || (choice6 == draw6))
    level++;
  if((choice5 == draw1) || (choice5 == draw2) || (choice5 == draw3) || (choice5 == draw3)|| (choice5 == draw4) || (choice5 == draw5) || (choice5 == draw6))
    level++;
  if((choice4 == draw1) || (choice4 == draw2) || (choice4 == draw3) || (choice4 == draw3)|| (choice4 == draw4) ||(choice4 == draw5) || (choice4 == draw6))
    level++;
  if((choice3 == draw1) || (choice3 == draw2) || (choice3 == draw3) || (choice3 == draw3) ||(choice3 == draw4) ||(choice3 == draw5) || (choice3 == draw6))
    level++;
  if((choice2 == draw1) || (choice2 == draw2) || (choice2 == draw3) || (choice2 == draw3) ||(choice2 == draw4) ||(choice2 == draw5) || (choice2 == draw6))
    level++;
  if((choice1 == draw1) || (choice1 == draw2) || (choice1 == draw3) || (choice1 == draw3) ||(choice1 == draw4) ||(choice1 == draw5) || (choice1 == draw6))
    level++;
    
  //Will check the level and announce if there is any winnings.
  if(level == 6)
    System.out.println("You've won a million dollars!");
  else if(level == 5)
    System.out.println("You've won a hundred thousand dollars!");
  else if(level == 4)
    System.out.println("You've won a eight thousand dollars!");
  else if(level == 3)
    System.out.println("You've won a twenty dollars!");
   else if(level == 2)
    System.out.println("You've won a six dollars!");
   else if(level == 1)
    System.out.println("You've won a two dollars!");
   else
    System.out.print("Sorry, nothing...");
  }
}
