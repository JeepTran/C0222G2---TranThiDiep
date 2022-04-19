package ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.animal;

import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.Fruit.Apple;
import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.Fruit.Fruit;
import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.Fruit.Orange;
import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.edible_animal.Edible;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[1]= new Tiger();
        animals[0]=new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());

        if (animal instanceof Chicken){
            Edible edibler = (Chicken) animal;
            System.out.println(" - " + edibler.howToEat());
        }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
        }

}
