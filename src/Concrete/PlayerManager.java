package Concrete;

import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService {
	private PlayerCheckManager playerCheckManager;
	
	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager = playerCheckManager;
	}
	
	@Override
	public void addPlayer(Player player) {
		if (playerCheckManager.checkWheterRealPerson(player)) {
			System.out.println(player.getFirstName() + " : oyuncu sisteme eklendi.");
		} else {
			System.out.println("Oyuncu Sisteme Eklenemedi!!! \n"
					+ "Kay�t yapabilmek i�in 2000 y�l�ndan �nce do�mu� olmal�s�n�z. \n"
					+ "Ad�n�z da en az iki karatker olmal�. Tekrar kontrol ediniz.");
		}
	}

	@Override
	public void updateRecord(Player player) {
		if (playerCheckManager.checkWheterRealPerson(player)) {
			System.out.println(player.getFirstName() + " : oyuncu bilgisi g�ncellendi.");
		} else {
			System.out.println("Oyuncu Bilgisi Sistemde G�ncellenemedi!!! \n"
					+ "G�ncelleme i�in do�um y�l� 2000'den erken olmal�. \n"
					+ "Ad�n�z da en az iki karatker olmal�. Tekrar kontrol ediniz.");
		}
		
	}

	@Override
	public void deleteRecord(Player player) {
		System.out.println(player.getFirstName() + " : oyuncu bilgisisi silindi.");
		
	}
	

}
