package Assignment05;


class Game
{
	String name="INDOOR";
	Game()
	{
		System.out.println("Type Of The Game= "+name);
	}
}

class BoardGame extends Game
{
	String boardgame_name="Chess";
	BoardGame()
	{
		System.out.println("Indore BoardGame Name= "+this.boardgame_name);
	}
}
class Chess extends BoardGame
{
String player_name="Rohit";
Chess()
{
System.out.println("Player playing indoor board game chess= "+this.player_name);	
}
}

public class Progrm01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess ch=new Chess();

	}

}
