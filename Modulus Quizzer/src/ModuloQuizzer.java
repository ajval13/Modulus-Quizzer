import java.util.Scanner;

public class ModuloQuizzer
	{
		public static void main(String[] args)
			{
			generateQuestion();
			}
		public static void generateQuestion()
		   {
			Scanner userInput = new Scanner (System.in);
			System.out.println("How many questions?");
		    int choice = userInput.nextInt();
		    int right = 0;
		    int wrong = 0;
		    for (int i = 0; i < choice; i++)
		    	{
		    	Scanner userInput1 = new Scanner (System.in);		    	
		    	if(i==3)
		    		{
		    	    int number = (int)(Math.random()*15)+1;
		    	    int number2 = (int)(Math.random()*50)+15;
		            System.out.println("What is " + number + " % " + number2 + " = ?");
		            int guess = userInput.nextInt();
		    	    if (number % number2 == guess)
		    		    {
		    		     System.out.println("Correct!");	
		    		     right++;
		    		    }
		    	    else if (number % number2 !=guess)
		    		    {
		    		    System.out.println("Wrong, The Correct Answer is " + number % number2);
		    		    wrong++;
		    		    }
		    	    }
		    	else if (i==1)
		    		{
		    		int number = (int)(Math.random()*20)+1;
			        System.out.println("What is " + number + " % " + number + " = ?");
			        int guess2 = userInput.nextInt();
			        if (number % number == guess2)
			    		{
			    		 System.out.println("Correct!");	
			    		 right++;
			    		}
			    	else if (number % number !=guess2)
			    		{
			    		System.out.println("Wrong, The Correct Answer is " + number % number);
			    		wrong++;
			    		}
		    		}
			    else if (i !=3 && i !=1)
			        {
			    	int number1 = (int)(Math.random()*20)+1;
					int number21 = (int)(Math.random()*15)+1;
				    System.out.println("What is " + number1 + " % " + number1 + " = ?");
				    int guess1 = userInput.nextInt();
					if (number1 % number21 == guess1)
					    {
					    System.out.println("Correct!");	
					    right++;
					    }
					 else if (number1 % number21 !=guess1)
					    {
					    System.out.println("Wrong, The Correct Answer is " + number1 % number21);
					    wrong++;
					    }
			    	}
		          }  	
		    System.out.println();
		    System.out.println("You Have " + right + " right and " + wrong + " wrong.");
		   }
	}

		    
		
