package Concrete;

import Abstract.CampaignService;
import Abstract.DiscountService;
import Entity.GameStore;
import Utility.CampaignUtility;

public class CampaignManager implements CampaignService {
	private DiscountService discounts;
	
	public CampaignManager(DiscountService discounts) {
		this.discounts = discounts;
	}

	@Override
	public void addCampaign(GameStore game) {
		CampaignUtility.addCampaign(discounts, game);		
	}

	@Override
	public void updateCampaign(GameStore game) {
		CampaignUtility.updateCampaign(discounts, game);
		
	}

	@Override
	public void deleteCampaign(GameStore game) {
		CampaignUtility.deleteCampaign(game);
		
	}
	
}
