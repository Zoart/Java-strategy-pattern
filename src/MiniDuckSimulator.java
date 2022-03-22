import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFLy();

        Duck model = new ModelDuck();
        model.performFLy();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFLy();
    }
}

