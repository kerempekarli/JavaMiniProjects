package Manager;

import Entities.Game;


public class GameManager {
		
	public void add (Game game) 
	{	
		System.out.println(game.getName() + "sisteme eklendi");
	}
	
	public void update (Game game) {
		System.out.println(game.getName() +"güncellendi");
	}
	
	public void delete (Game game) {
		System.out.println(game.getName() + "sistemden silindi");
	}
	
	public void makeDiscount(Game game,int rate) {
		game.setDiscount(rate);
	}
	
	public void setPrice(Game game, int price) {
		game.setPrice(price);
	}
	
}
