package io.matthewbelongia;

/**
 * Created by matthewb on 5/6/16.
 */
abstract class PolymorphismPet {

        protected String animal;
        protected String name;
        public String getAnimal(){ return animal;}
        public String getName(){ return name;}
        public void setName(String newName){this.name = newName;}
        public abstract String speak();
    }
    class Dog extends PolymorphismPet{
        public Dog(){ animal = "Dog"; }
        public Dog(String newName){
            animal = "Dog";
            name = newName;}
        public String speak(){ return "Woof Woof";}
    }
    class Cat extends PolymorphismPet{
        public Cat(){ animal = "Cat"; }
        public Cat(String newName){ animal = "Cat";
            name = newName;}
        public String speak(){ return "Meow!"; }
    }
    class Other extends PolymorphismPet{
        public Other(){ animal = "Other"; }
        public Other(String newName){ animal = "Other";
            name = newName;}
        public String speak(){ return "Other noise"; }
    }
