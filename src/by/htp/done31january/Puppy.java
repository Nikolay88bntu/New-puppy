package by.htp.done31january;

public class Puppy extends Dog implements physicalActions {

private String nickname;

public Puppy (String sound, String jumping, String running, String biting, String nickname){

super(sound, jumping, running, biting);
this.nickname = nickname;

}

public void setNickname(String nickname){

this.nickname = nickname;

}

public String getNickname(){

return nickname;

}

@Override
    public String toString() {
	
	return "Puppy's name is "+getNickname()+".";
}

public void printNickname(){ // a method that prints to console the name of a puppy
	
	String printedNickname = toString();
	System.out.println(printedNickname);
	
}

@Override
public void Sound(){ // a method that makes puppy make sounds on console
	
	System.out.println("Puppy can "+super.getSound()+".");
}

@Override
public void Run(){ // a method that describes how a puppy runs on console
	
	System.out.println("Puppy "+super.getRunning()+".");
}

@Override
public void Jump(){ // a method that describes how a puppy jumps on console
	
	System.out.println("Puppy "+getNickname()+" "+super.getJumping()+".");
}

public void puppyBite(){ // this method shows on console that puppy can bite
	
	System.out.println("Puppy "+super.getBiting()+".");
}

}

