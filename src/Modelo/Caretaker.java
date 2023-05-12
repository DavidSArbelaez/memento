package Modelo;

import java.util.Stack;

public class Caretaker {
	//private Memento memento;
	private Stack<Memento> mementos;
	private GameState gt;
	
	public Caretaker() {
		this.mementos = new Stack<Memento>();
		this.gt = new GameState(1);
	}
	
	public void setpositionPlayer(int index,int position) {
		saveMemento(gt.save());
		gt.setPositionPlayer(index, position);
	}

	public void setLevel(int lvl) {
		saveMemento(gt.save());
		this.gt.setLevel(lvl);
	}
	
	public void mostrarEstado() {
		gt.printState();
	}
	
	/*
	 * Método que agrega un jugador al juego y guarda el estado en un historial(mementos)
	 */
	public void addPlayer(Player pj) {
		saveMemento(gt.save());
		gt.addPlayer(pj);
		mostrarEstado();
	}
	
	/*
	 * Método que restaura el estado y los datos de los jugadores a uno anterior
	 * Ademas muestra el estado de los jugadores y el nivel
	 */
	public void GTrestore(Memento m) {
		gt.restore(m);
		mostrarEstado();
	}
	
	/*
	 * Método que guarda los datos en el historial(mementos)
	 */
    public void saveMemento(Memento memento) {
        this.mementos.push(memento);
    }

    /*
     * Método que restaura el juego con los ultimos datos
     */
    public Memento restore() {
    	if (!mementos.isEmpty()) {
    		return mementos.pop();
    	}else {
    		return null;
    	}
    }
}