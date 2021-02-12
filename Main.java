import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   String q1 = "Is the Pythagreon Theorem 'a^2 + b^2 = c^2'? True or False"; //questions
   String q2 = "What is 2 + 2?\nA. 2\nB. 4";
   String q3 = "True of False, do penguins only live in Antartica?";
   String q4 = "What is the main ingredient in bread?\nA. Wheat\nB. Flour";
   String q5 = "What is the top selling Video Game of all time\nA. Call of Duty\nB. Minecraft";
   String q6 = "True or False, is a chicken a mammal?";
   String q7 = "How many gigabytes are in a terrabyte?\nA. 1000 \nB. 100";
   String q8 = "True or False, is Israel real?";
   String q9 = "True or False, 5 + 7 = 13?";
   String q10 = "True or False, is the distance from the Earth to the Sun 91.774 miles?";
   String bQ1 = "True or False, Jeff Bezos is the richest person in the world?"; //bonus questions
   String bQ2 = "True or False, the first tea bags were made of silk?";
   String bQ3 = "True or False, Horses, ponies, donkeys, mules, and zebras are also known as equines?";
   String bQ4 = "True or False, Most of the world’s coffee in the world is produced in Brazil?";
   String bQ5 = "True or False, The Bible has 74 books in total?";
   String bQ6 = "True or False, The Beatles’ debut studio album is known as 'Help!'?";
   String bQ7 = "True or False, There are four bases in baseball?";
   String bQ8 = "True or False, Candy canes were made to represent shepherd’s canes?";
   String bQ9 = "True or False, Rudolph the reindeer first appeared in 1939?";
   String bQ10 = "True or False, The Richter scale classifies hurricanes into 5 categories?";
   int chance1 = (int) (Math.random() * 10 + 1); //decided bonus questions
   int chance2 = (int) (Math.random() * 10 + 1);
   int chance3 = (int) (Math.random() * 10 + 1);
   int chance4 = (int) (Math.random() * 10 + 1);
   int chance5 = (int) (Math.random() * 10 + 1);
   int chance6 = (int) (Math.random() * 10 + 1);
   int chance7 = (int) (Math.random() * 10 + 1);
   int chance8 = (int) (Math.random() * 10 + 1);
   int chance9 = (int) (Math.random() * 10 + 1);
   int chance10 = (int) (Math.random() * 10 + 1);
   String q1Answer; //answer variables
   String q2Answer;
   String q3Answer;
   String q4Answer;
   String q5Answer;
   String q6Answer;
   String q7Answer;
   String q8Answer;
   String q9Answer;
   String q10Answer;
   String bQ1Answer; //bonus answer variables
   String bQ2Answer;
   String bQ3Answer;
   String bQ4Answer;
   String bQ5Answer;
   String bQ6Answer;
   String bQ7Answer;
   String bQ8Answer;
   String bQ9Answer;
   String bQ10Answer;
   int points = 0; //score

   try
   {
    System.out.println("Welcome to Random Facts That Won't Help You in Life!\n");
    Thread.sleep(2000);
    System.out.println("In this trivia game, there will be 10 questions you will be asked.");
    Thread.sleep(2000);
    System.out.println("Each question will be worth 10 points.");
    Thread.sleep(2000);
    System.out.println("Random bonus questions can appear if you miss a question.");
    Thread.sleep(2000);
    System.out.println("Those are worth 5 points.");
    Thread.sleep(2000);
    System.out.println("Got everything? Alright lets start!\n\n\n");
    Thread.sleep(1000);

    System.out.println(q1);
    q1Answer = input.nextLine();
    if (q1Answer.equalsIgnoreCase("true"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }

    Thread.sleep(2000);

    if ((chance1 == 1) & (q1Answer.equalsIgnoreCase("false")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ1);
    bQ1Answer = input.nextLine();
    if (bQ1Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }


    System.out.println(q2);
    q2Answer = input.nextLine();
    if (q2Answer.equalsIgnoreCase("b"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }

    Thread.sleep(2000);

    if ((chance2 == 2) & (q2Answer.equalsIgnoreCase("a")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ2);
    bQ2Answer = input.nextLine();
    if (bQ2Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q3);
    q3Answer = input.nextLine();
    if (q3Answer.equalsIgnoreCase("false"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    
    Thread.sleep(2000);

    if ((chance3 == 3) & (q3Answer.equalsIgnoreCase("true")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ3);
    bQ3Answer = input.nextLine();
    if (bQ3Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q4);
    q4Answer = input.nextLine();
    if (q4Answer.equalsIgnoreCase("b"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    
    Thread.sleep(2000);

    if ((chance4 == 4) & (q4Answer.equalsIgnoreCase("a")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ4);
    bQ4Answer = input.nextLine();
    if (bQ4Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q5);
    q5Answer = input.nextLine();
    if (q5Answer.equalsIgnoreCase("b"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
        
    Thread.sleep(2000);

    if ((chance5 == 5) & (q5Answer.equalsIgnoreCase("a")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ5);
    bQ5Answer = input.nextLine();
    if (bQ5Answer.equalsIgnoreCase("false"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q6);
    q6Answer = input.nextLine();
    if (q6Answer.equalsIgnoreCase("false"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
        
    Thread.sleep(2000);

    if ((chance6 == 6) & (q6Answer.equalsIgnoreCase("true")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ6);
    bQ6Answer = input.nextLine();
    if (bQ6Answer.equalsIgnoreCase("false"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q7);
    q7Answer = input.nextLine();
    if (q7Answer.equalsIgnoreCase("a"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
        
    Thread.sleep(2000);

    if ((chance7 == 7) & (q7Answer.equalsIgnoreCase("b")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ7);
    bQ7Answer = input.nextLine();
    if (bQ7Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q8);
    q8Answer = input.nextLine();
    if (q8Answer.equalsIgnoreCase("true"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
        
    Thread.sleep(2000);

    if ((chance8 == 8) & (q8Answer.equalsIgnoreCase("false")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ8);
    bQ8Answer = input.nextLine();
    if (bQ8Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q9);
    q9Answer = input.nextLine();
    if (q9Answer.equalsIgnoreCase("false"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }

    Thread.sleep(2000);

    if ((chance9 == 9) & (q9Answer.equalsIgnoreCase("true")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ9);
    bQ9Answer = input.nextLine();
    if (bQ9Answer.equalsIgnoreCase("true"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(2000);
    }

    System.out.println(q10);
    q10Answer = input.nextLine();
    if (q10Answer.equalsIgnoreCase("true"))
    {
      points = points + 10;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    
    Thread.sleep(2000);

    if ((chance10 == 10) & (q10Answer.equalsIgnoreCase("false")))
    {
    System.out.println("BONUS QUESTION!");
    Thread.sleep(1000);
    System.out.println(bQ10);
    bQ10Answer = input.nextLine();
    if (bQ10Answer.equalsIgnoreCase("false"))
    {
      points = points + 5;
      System.out.println("Correct!\n\n\n");
    }
    else
    {
      System.out.println("Wrong!\n\n\n");
    }
    Thread.sleep(3000);
    }

    System.out.println("Your final score is " + points + "! \n");

    Thread.sleep(2000);

    System.out.println("Thank you for playing!");

   }
   catch (Exception e)
   {
    System.out.println("You can't do that");
   }
  }
}
