/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{

    public Warrior()
	{

		super("Warrior", 125, 4, .8, 35, 60, .2);


    }//end constructor


	public void crushingBlow(DungeonCharacter opponent)
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}//blow failed

	}//end crushingBlow method

	//去掉
	/**
	 * ************************************************************
	 * 
	 * delete
	 * ************************************************************
	 */
//	public void attack(DungeonCharacter opponent)
//	{
//		System.out.println(name + " swings a mighty sword at " +
//							opponent.getName() + ":");
//		super.attack(opponent);
//	}//end override of attack method
	

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
			super.oneRound(opponent, "Crushing Blow on Opponent", name + " swings a mighty sword at " +
					opponent.getName() + ":");
//		    System.out.println("1. Attack Opponent");
//		    System.out.println("2. Crushing Blow on Opponent");
//		    System.out.print("Choose an option: ");
//		    
//		    switch (Keyboard.readInt())
//		    {
//			    case 1: super.attack(opponent,name + " swings a mighty sword at " +
//						opponent.getName() + ":");
//			        break;
//			    case 2: crushingBlow(opponent);
//			        break;
//			    default:
//			        System.out.println("invalid choice!");
//		    }//end switch
//
//			numTurns--;
//			if (numTurns > 0)
//			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }//end battleChoices method

    /**
	 * ************************************************************
	 * 
	 * The newly added
	 * ************************************************************
	 *///新增
  	public void option2Attack(DungeonCharacter opponent) {
  		crushingBlow(opponent);
  	}
}//end Hero class