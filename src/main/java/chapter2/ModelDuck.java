package chapter2;

public class ModelDuck extends Duck {
    public void display() {
        System.out.println("I'm a model duck!");
    }

    ModelDuck(){
        flyBehavior = new FlyNoWings();
        quackBehavior = new QuackNoSound();
    }
}
