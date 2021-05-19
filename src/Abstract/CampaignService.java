package Abstract;

import Entity.GameStore;

public interface CampaignService {
	void addCampaign(GameStore game);
	void updateCampaign(GameStore game);
	void deleteCampaign(GameStore game);
}
