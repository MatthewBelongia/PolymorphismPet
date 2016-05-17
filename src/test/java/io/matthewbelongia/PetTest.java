package io.matthewbelongia;

/**
 * Created by matthewb on 5/6/16.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    PolymorphismPet polymorphismPet;
    PolymorphismPet cat;
    PolymorphismPet dog;
    PolymorphismPet other;
    @Before public void initialize() {
        polymorphismPet = new PolymorphismPet() {
            @Override
            public String speak() {
                return null;
            }
        };
    }

    @Test public void changeNameTest(){
        cat = new Cat("oldName");
        cat.setName("newName");
        dog = new Dog("oldDog");
        dog.setName("newTricks");
        other = new Other("other");
        other.setName("newOther");

        String name = cat.getName();
        String superName = cat.getName();
        String named = dog.getName();
        String superNamed = dog.getName();
        String nameo = dog.getName();
        String superNameo = dog.getName();

        assertTrue("Polymorphism can change its subclasses names",name.equals(superName));
        assertTrue("Polymorphism can change its subclasses names",named.equals(superNamed));
        assertTrue("Polymorphism can change its subclasses names",nameo.equals(superNameo));

    }

    @Test public void sayHelloTest(){
        cat = new Cat();
        dog = new Dog();
        other = new Other();

        String cHello = cat.speak();
        String dHello = dog.speak();
        String oHello = other.speak();

        String kitty = "Meow!";
        String doge = "Woof Woof";
        String otherthing = "Other noise";

        assertTrue("Cat says",kitty.equals(cHello));
        assertTrue("Dog says",doge.equals(dHello));
        assertTrue("Fox says .. ",otherthing.equals(oHello));

    }
}
