package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Lop_Animal_va_interface_Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal : animals) {
            System.out.println( animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible=(Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howToEat());
        }
    }
}

