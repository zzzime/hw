/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{

    public Thief()
	{
		super("Thief", 75, 6, .8, 20, 40, .5);



    }//end constructor

	public void surpriseAttack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Surprise attack was successful!\n" +
								name + " gets an additional turn.");
			numTurns++;
			attack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    attack(opponent);


	}//end surpriseAttack method

	//有修改
	/**
	 * ************************************************************
	 * 
	 * There are modifications
	 * ************************************************************
	 */
    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);

		do
		{
			super.oneRound(opponent, "Surprise Attack", "");
//		    System.out.println("1. Attack Opponent");
//		    System.out.println("2. Surprise Attack");
//		    System.out.print("Choose an option: ");
//
//		    switch (Keyboard.readInt())
//		    {
//			    case 1: super.attack(opponent, "");
//			        break;
//			    case 2: surpriseAttack(opponent);
//			        break;
//			    default:
//			        System.out.println("invalid choice!");
//		    }//end switch
//
//			numTurns--;
//			if (numTurns > 0)
//			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }
    
    //新增
    /**
	 * ************************************************************
	 * 
	 * The newly added
	 * ************************************************************
	 */
	public void option2Attack(DungeonCharacter opponent) {
		surpriseAttack(opponent);
	}

}
