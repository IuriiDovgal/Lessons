package FirstTask;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ActionCases extends Animal{

    public void addCase(){
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        animal.setAnimalType();
        AnimalType animalType = AnimalType.valueOf(animal.getAnimalType());

        animal.setName();
        while(true){
            try {
                animal.setAge();
                break;}
            catch (InputMismatchException e2) {
                System.out.println("Поле принимает только цифры!");
            }
        }
        animal.setWeith();
        animal.setColor();



        switch (animalType) {
            case CAT:
                cat.say();
                break;
            case DOG:
                dog.say();
                break;
            case DUCK:
                duck.say();
                break;
        }
        List<String> listOfAnimals = Arrays.asList(animal.getName(), String.valueOf(animal.getAge()), animal.getWeight(), animal.getColor(), animalType.getAnimalType());
        System.out.println(listOfAnimals);
        System.out.println("Привет! Меня зовут "+animal.getName()+" мне "+animal.getAge()+" "+animal.getOldName()+", я вешу - "+ animal.getWeight()+" кг, мой цвет - "+ animal.getColor());
    }


}
