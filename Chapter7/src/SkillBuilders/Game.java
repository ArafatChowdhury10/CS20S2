package SkillBuilders;

public class Game 
{

	public static void main(String[] args)
	{
		//Create instances (objects) from the GameCharacter
		NewGameCharacter player1 = new NewGameCharacter("Hero", 100);//Instance 1
		NewGameCharacter player2 = new NewGameCharacter("Villain", 85);//Instance 2
		
		player1.attack();//Behaviour:-calls a method
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus());
		System.out.println(player2.getStatus());
		


	}

}
