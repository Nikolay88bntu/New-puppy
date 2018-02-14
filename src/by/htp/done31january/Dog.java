package by.htp.done31january;

public class Dog extends Animal implements physicalActions {

private String biting; // "bites by pressing two jaws"
private Puppy [] puppies;

private int index;

Dog (String sound,  String running, String jumping, String biting){

super(sound, running, jumping);
this.biting = biting;

}

public Puppy[] getPuppies(){
return puppies;
}


public void setBiting(String biting){

this.biting = biting;

}

public String getBiting(){

return biting;

}

public void addPuppy(Puppy puppies){

this.puppies[index] = puppies;
index ++;

}
@Override
public void Sound(){ // a method that makes puppy make sounds on console
	
	System.out.println("All dogs can "+super.getSound()+".");
}

@Override
public void Run(){ // a method that describes how a puppy runs on console
	
	System.out.println("A dog "+super.getRunning()+".");
}

@Override
public void Jump(){ // a method that describes how a puppy jumps on console
	
	System.out.println("Dog "+super.getJumping()+".");
}

@Override
    public String toString() {
        return "Dog can: "+super.getSound()+". Dog "+super.getRunning()+". And Dog "+super.getJumping()+". If you tease the Dog it "+getBiting()+"";
    }

}
