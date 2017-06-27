public class MallardDuck extends Duck{
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }

    public MallardDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior = new Quack();
    }
}
