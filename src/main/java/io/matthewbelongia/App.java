package io.matthewbelongia;

import java.util.ArrayList;

/**
 * Created by matthewb on 5/6/16.
 */
public class App extends UserInteraction{

    public static enum PetChoices{
        CAT, DOG, OTHER,
    }
    public static PetChoices petChoices;

    public static void main(String[] args){
        ArrayList<PolymorphismPet> allAnimals = new ArrayList<PolymorphismPet>();
        UserInteraction UI = new UserInteraction();
        System.out.println("How many pets do you have?");
        int numberOfPets = UI.promptUserInputForInteger();

        for(int x =0;x<numberOfPets;x++){
            System.out.println("What is the pets name?");
            String animalName = UI.promptUserInputForString();
            System.out.println("What type of animal is it?");
            String animalType = UI.promptUserInputForString();
            animalType = animalType.toUpperCase();

            try {
                petChoices = PetChoices.valueOf(animalType);
            } catch ( IllegalArgumentException e ) {
                animalType = "OTHER";
            }
            petChoices = PetChoices.valueOf(animalType);

            switch (petChoices){
                case DOG:
                    allAnimals.add(new Dog(animalName));
                    break;
                case CAT:
                    allAnimals.add(new Cat(animalName));
                    break;
                case OTHER:
                    allAnimals.add(new Other(animalName));
                    break;
                default:
                    allAnimals.add(new Other(animalName));
            }
        }

        for(PolymorphismPet PR : allAnimals){
            String hello = PR.speak();
            System.out.println("Name: " + PR.getName()+"\n"+ "Type: " + PR.getAnimal()+ "\n" + hello+"\n");
        }

    }
}
