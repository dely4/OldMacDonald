class NamedCow extends Cow
{

	private String name;
	public NamedCow(String type, String sound, String name){
		this.name = name;
		mySound = sound;
		myType = type;
	}
	
	public String getName(){
		return(name);
	}


}