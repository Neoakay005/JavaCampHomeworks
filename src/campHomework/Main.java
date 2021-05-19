package campHomework;

import Abstract.DiscountService;
import Concrete.CampaignEndOfYear;
import Concrete.CampaignManager;
import Concrete.CampaignSpring;
import Concrete.GameStoreManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entity.GameStore;
import Entity.Player;

public class Main {

	public static void main(String[] args) {
		// ----PLAYER MANAGEMENT----
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		
		Player playerHalil = new Player();
		playerHalil.setId(1);
		playerHalil.setFirstName("Halil Ýbrahim");
		playerHalil.setLastName("Akay");
		playerHalil.setNationalityId("12345678912");
		playerHalil.setDateOfBirthYear(1987);
		
		playerManager.addPlayer(playerHalil);
		playerManager.updateRecord(playerHalil);
		playerManager.deleteRecord(playerHalil);
		
		// ----GAME MANAGEMENT----
		GameStore game = new GameStore(1, "Hidden & Dangerous II", 14.99);
		
		GameStoreManager gameManager = new GameStoreManager();
		gameManager.buy(playerHalil, game);
		
		// ----DISCOUNT MANAGEMENT----
		CampaignManager campaignManager = new CampaignManager(new CampaignSpring());
		campaignManager.addCampaign(game);
		campaignManager.updateCampaign(game);
		campaignManager.deleteCampaign(game);
		
		DiscountService discount = new CampaignEndOfYear();
		discount.discount(game.getGameName(), game.getGamePrice());
		
			
	}

}
