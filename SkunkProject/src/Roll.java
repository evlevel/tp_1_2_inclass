
public class Roll
{
	private Dice dice;
	
	public Roll()
	{
		this.dice = new Dice();
		this.dice.roll();
	}
	
	public Dice getDice()
	{
		return this.dice;
	}

	public boolean isDoubleSkunk()
	{
		return (dice.getDie1().getLastRoll() == 1 &&
			   dice.getDie2().getLastRoll() == 1 );
	}

	public void setDice(Die die1, Die die2)
	{
		this.dice.setDie1(die1);
		this.dice.setDie2(die2);
		this.dice.roll();
		
	}
	
	
}
