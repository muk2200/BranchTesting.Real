public class Dog extends Animal {


    @Override
    public void makeSound() {
    System.out.println("WUFF");
    }

    @Override
    public boolean eat(String foodType) {
        return false;
    }
}
