package Abstract;
import Entity.GameStore;
import Entity.Player;

public interface GameStoreService {
	void buy(Player player, GameStore game);
}
