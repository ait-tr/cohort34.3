package homework.pet;

import homework.pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet cat = new Pet(1, " Cat ", 2, "Murka");
        Pet dog = new Pet(2, " Dog ", 5, "Buran");

        cat.display();
        cat.thereIs();
        cat.sleep();
        cat.eat();
        cat.play();
        dog.makeSound();
        cat.bite();
    }

}
