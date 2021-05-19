package Concrete;

import Abstract.GameStoreService;
import Entity.GameStore;
import Entity.Player;

public class GameStoreManager implements GameStoreService {

	@Override
	public void buy(Player player, GameStore game) {
		System.out.println("Say�n " + player.getFirstName() + "... " + game.getGameName() + 
				": Oyununu " + game.getGamePrice() + " birimine sat�n ald�n�z. Te�ekk�r ederiz.");
		
	}

}
