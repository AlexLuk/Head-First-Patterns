package chapter2;

public class DucksTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();

        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();
    }
}
