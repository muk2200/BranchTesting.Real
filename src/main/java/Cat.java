public class Cat extends Animal{

    @Override
    public void makeSound() {
    System.out.println("MIAW");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }
}
