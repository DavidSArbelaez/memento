package Modelo;

public class Player {
	private String name;
    private int position;
    //private int health;

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
        //this.health=100;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
    /*private boolean isDead() {
    	return (this.health>0)?false:true;
    }
    
    private void damage() {
    	this.health-=10;
    	if(isDead()) {
    		System.out.println(name+" murio :(");
    	}
    }
    
    public void damageReceive() {
    	if(isDead()) {
    		System.out.println("Deja de recibir daño que ya estas muerto");
    	}else {
    		damage();
    		System.out.println(name+" recibio 10 de daño, tiene "+health+" de vida.");
    	}
    }*/

    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	@Override
    public String toString() {
        return name + " (" + position + ")";
    }


}
