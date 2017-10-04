package chapter2;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public abstract void display();

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly(){
        flyBehavior.fly();
    }

    void performQuack(){
        quackBehavior.quack();
    }
}

