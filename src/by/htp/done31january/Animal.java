package by.htp.done31january;

public class Animal {
	private String sound; //"barks Woof-Woof!"
	private String running; //"runs on four paws"
	private String jumping; // "jumps up to two meters high"

	public Animal (String sound, String running, String jumping) {

	this.sound = sound;
	this.running = running;
	this.jumping = jumping;
	}

	public void setSound (String sound){
	this.sound = sound;
	}

	public String getSound(){
	return sound;
	}

	public void setRunning (String running){
	this.running = running;
	}

	public String getRunning(){
	return running;
	}

	public void setJumping (String jumping){
	this.jumping = jumping;
	}

	public String getJumping(){
	return jumping;
	}

}
