package ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
        }
    }
}
