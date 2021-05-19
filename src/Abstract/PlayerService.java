package Abstract;
import Entity.Player;

public interface PlayerService {
	void addPlayer(Player player);
	void updateRecord(Player player);
	void deleteRecord(Player player);
}
