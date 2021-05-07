package Manager.GamerManager;

import Entities.Game;
import Entities.Gamer;
import Manager.CheckService;

public class GamerManager {
	
		private CheckService _checkService;
		
		public GamerManager(CheckService checkService) {
			_checkService = checkService;
		}
	
		public void save (Gamer gamer) {
			
			System.out.println(gamer.getName() + gamer.getSurname() + "sisteme eklendi");
		}
		
		public void update (Gamer gamer) {
			System.out.println(gamer.getName() + gamer.getSurname() +"güncellendi");
		}
		
		public void delete (Gamer gamer) {
			System.out.println(gamer.getName() + gamer.getSurname() + "silindi");
		}
		
		public void buyGame(Game game, Gamer gamer) {
			
			gamer.setMoney(gamer.getMoney() - game.getUnitPriceAfterDiscount());
			System.out.println(game.getName() + "hesabýnýza eklendi. Ýyi oyunlar.");			
		}
		
		public void addMoney(Gamer gamer, int money) {
			gamer.setMoney(gamer.getMoney()+money);
		}
		
		public void checkGamerMoneyAmount(Gamer gamer) {
			System.out.println("Ýsim-Soyisim :" + gamer.getName() + gamer.getSurname());
			System.out.println("Hesabýnýzdaki para :" + gamer.getMoney() + "$");
		}
}