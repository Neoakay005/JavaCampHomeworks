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
					+ "Kayýt yapabilmek için 2000 yýlýndan önce doðmuþ olmalýsýnýz. \n"
					+ "Adýnýz da en az iki karatker olmalý. Tekrar kontrol ediniz.");
		}
	}

	@Override
	public void updateRecord(Player player) {
		if (playerCheckManager.checkWheterRealPerson(player)) {
			System.out.println(player.getFirstName() + " : oyuncu bilgisi güncellendi.");
		} else {
			System.out.println("Oyuncu Bilgisi Sistemde Güncellenemedi!!! \n"
					+ "Güncelleme için doðum yýlý 2000'den erken olmalý. \n"
					+ "Adýnýz da en az iki karatker olmalý. Tekrar kontrol ediniz.");
		}
		
	}

	@Override
	public void deleteRecord(Player player) {
		System.out.println(player.getFirstName() + " : oyuncu bilgisisi silindi.");
		
	}
	

}
