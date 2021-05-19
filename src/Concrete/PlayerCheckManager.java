package Concrete;

import Abstract.PlayerCheckService;
import Entity.Player;

public class PlayerCheckManager implements PlayerCheckService {
	
	public boolean checkWheterRealPerson(Player player) {
		
		int playerBirthYear = player.getDateOfBirthYear();
		String playerName = player.getFirstName();
		
		if (playerBirthYear < 2000 && playerName.length() > 1) {
			return true;
		} else {
			return false;
		}
	}
}
