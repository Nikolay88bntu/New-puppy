package by.htp.done31january;



public class StartPuppy { 

public static void main(String[] args){
	
        Puppy puppy1 = new Puppy("bark Woof-Woof", "runs on four paws", "jumps up to two meters high",
								"bites by pressing two jaws", "Druzhok");
        
        Puppy puppy2 = new Puppy("bark Woof-Woof", "runs on four paws", "jumps up to two meters high",
				"bites by pressing two jaws", "Tuzik");
								
		Dog particularDog = new Dog("bark loudly", "runs on four paws", "jumps when it wants to",
				"bites by pressing two jaws");
		

       puppy1.printNickname();
       puppy1.Sound();
       particularDog.Sound();
       particularDog.Jump();
       puppy1.Run();
       puppy2.Jump();
       puppy1.puppyBite();
    }

}
