class Chick implements Animal
{     

	private String myType;
	private String mySound;

	public Chick(String type, String sound, String sound_two){
		myType = type;
		int decider = (int)(Math.random()*2);
		if(decider == 0){
			mySound = sound;
		}else{
			mySound = sound_two;
		}
	}


	public Chick(String type, String sound){
		myType = type;
		mySound = sound;
	}

	public Chick(){
		myType = "Unknown";
		mySound = "Unknown";
	}

	public String getSound(){
		return(mySound);
	}

	public String getType(){
		return(myType);
	}


}
