package SkillBuilders;

public class NewGameCharacter 
{
	//Instance variables
	private String name;
	private int health;
	
	//Constructor method
	//public means met
	public NewGameCharacter(String charName, int starHealth)
	{
		name = charName;
		health = starHealth;
	}
	
	//Behavior: actions the character can do
	public void attack()
	{
		System.out.println(name + "attacks! Deals 10 damage.");
	}
	
	public void takeDamage(int damage)
	{
		health = health - damage;
		
		if(health < 0)
			health = 0;
		System.out.println(name + "s health is now " + health);
	}
	
	 public String getStatus() 
	 {
	        return name + " has " +  health  + " health.";
	 }
	
}
