class Farm 
{     
   private Animal[] aBunchoOfAnimals;
   public Farm(){

   		aBunchoOfAnimals = new Animal[3];
   		aBunchoOfAnimals[0] = new Cow("cow", "moo");
   		aBunchoOfAnimals[1] = new Chick("chick", "cluck");
   		aBunchoOfAnimals[2] = new Pig("pig", "oink");
   }

   public void animalSounds(){
   		for(int i = 0; i < aBunchoOfAnimals.length; i++){
   			System.out.println(aBunchoOfAnimals[i].getType() + " goes " + aBunchoOfAnimals[i].getSound());
   		}
   }

}
