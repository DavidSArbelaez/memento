package Modelo;

import java.util.ArrayList;

public class GameState {
	private int level;
    private ArrayList<Player> players = new ArrayList<Player>();

    public GameState(int level) {
        this.level = level;
    }
    
    public void setPositionPlayer(int index,int position) {
    	Player p1 = players.get(index);
    	p1.setPosition(position);
    	players.set(index, p1);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    public void addPlayer(Player pj) {
    	this.players.add(pj);
    }

    public Memento save() {
        /*System.out.println("save");
    	mostrarPlayers();*/
    	return new Memento(level, players);
    }

    /*
     * Método que restaura el estado y los datos de los jugadores a uno anterior
     */
    public void restore(Memento memento) {
        this.level = memento.getLevel();
        this.players = memento.getPlayers();
    }
    
    private void mostrarPlayers() {
    	for (Player player : players) {
			System.out.println("\t"+player.toString());
		}
    }

    public void printState() {
        System.out.println("Level: " + level);
        System.out.println("Players: " );
        mostrarPlayers();
    }
}
