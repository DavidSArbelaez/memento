package Modelo;

import java.util.ArrayList;

public class Memento {
	private int level;
    private ArrayList<Player> players;

    public Memento(int level, ArrayList<Player> playersn) {
        this.level = level;
        this.players = new ArrayList<Player>();
        crearPlayers(playersn);
    }
    
    private void crearPlayers(ArrayList<Player> players2) {
    	for (Player player : players2) {
        	this.players.add(new Player(player.getName(),player.getPosition() ));
		}
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<Player> getPlayers() {
    	return players;
    }
}
