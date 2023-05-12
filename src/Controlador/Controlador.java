package Controlador;

import java.util.Random;

import Modelo.Caretaker;
import Modelo.Memento;
import Modelo.Player;

public class Controlador {
	Caretaker Vin_Diesel = new Caretaker();

	public void startAuto() {
		Random r = new Random();
		int index = r.nextInt(1, 4);
		for (int i = 0; i < index; i++) {
			addPlayer("Jugador " + i, r.nextInt(30));
		}

		// Se realiza un cambio de nivel para los jugadores
		int lvl = r.nextInt(10);
		System.out.println("Cambio de nivel:1-" + lvl);
		Vin_Diesel.setLevel(lvl);
		Vin_Diesel.mostrarEstado();

		// Se realiza un cambio de posicion en un jugador
		System.out.println("Cambio de posición :");
		Vin_Diesel.setpositionPlayer(r.nextInt(index), r.nextInt(45));
		Vin_Diesel.mostrarEstado();

		for (int i = 0; i < 2; i++) {
			// Se devuelve a un estado anterior
			System.out.println("Se devuelve a un estado anterior");
			restore();
		}

		// Se realiza un cambio de posicion en un jugador
		System.out.println("Cambio de posición :");
		Vin_Diesel.setpositionPlayer(r.nextInt(index), r.nextInt(45));
		Vin_Diesel.mostrarEstado();

		for (int i = 0; i < 2; i++) {
			// Se devuelve a un estado anterior
			System.out.println("Se devuelve a un estado anterior");
			restore();
		}
	}

	public void setPosition(int index, int position) {
		Vin_Diesel.setpositionPlayer(index, position);
	}

	/*
	 * Método que agrega un jugador
	 */
	public void addPlayer(String name, int position) {
		Vin_Diesel.addPlayer(new Player(name, position));
	}

	/*
	 * Método que restaura los datos del juego a los ultimos guardados
	 */
	public void restore() {
		// Restaurar el estado previo del juego

		Memento m = Vin_Diesel.restore();
		if (m != null) {
			Vin_Diesel.GTrestore(m);
		} else {
			System.out.println("No hay versiones anteriores que usar");
		}
	}

}
