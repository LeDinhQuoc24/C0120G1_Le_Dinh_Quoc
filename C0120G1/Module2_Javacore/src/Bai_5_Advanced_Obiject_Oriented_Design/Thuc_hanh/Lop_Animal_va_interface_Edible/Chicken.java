package Bai_5_Advanced_Obiject_Oriented_Design.Thuc_hanh.Lop_Animal_va_interface_Edible;

public class Chicken extends Animal implements Edible{
    public Chicken() {
    }
    @Override
    public String makeSound() {
        return "Chip...chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}


