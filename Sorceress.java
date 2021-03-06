/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

//-----------------------------------------------------------------
    public Sorceress()
	{
		super("Sorceress", 75, 5, .7, 25, 50, .3);


    }//end constructor

//-----------------------------------------------------------------
	public void increaseHitPoints()
    {
	    int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(name + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ hitPoints);
		 System.out.println();

    }//end increaseHitPoints method

	//去掉
	/**
	 * ************************************************************
	 * 
	 * delete
	 * ************************************************************
	 */
//-----------------------------------------------------------------
//	public void attack(DungeonCharacter opponent)
//	{
//		System.out.println(name + " casts a spell of fireball at " +
//							opponent.getName() + ":");
//		super.attack(opponent);
//	}//end override of attack method

//-----------------------------------------------------------------
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
			super.oneRound(opponent, "Increase Hit Points", name + " casts a spell of fireball at " +
					opponent.getName() + ":");
			
//		    System.out.println("1. Attack Opponent");
//		    System.out.println("2. Increase Hit Points");
//		    System.out.print("Choose an option: ");
//
//		    switch (Keyboard.readInt())
//		    {
//			    case 1: super.attack(opponent,name + " casts a spell of fireball at " +
//						opponent.getName() + ":");
//			        break;
//			    case 2: increaseHitPoints();
//			        break;
//			    default:
//			        System.out.println("invalid choice!");
//		    }//end switch
//
//			numTurns--;
//		    if (numTurns > 0)
//			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0 && hitPoints > 0 && opponent.getHitPoints() > 0);

    }//end overridden method
    /**
	 * ************************************************************
	 * 
	 * The newly added
	 * ************************************************************
	 *///新增
  	public void option2Attack(DungeonCharacter opponent) {
  		increaseHitPoints();
  	}
}//end class

