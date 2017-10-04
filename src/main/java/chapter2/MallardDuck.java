package chapter2;

public class MallardDuck extends Duck{
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }

    MallardDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior = new Quack();
    }
}
