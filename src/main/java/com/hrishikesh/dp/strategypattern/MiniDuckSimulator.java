package com.hrishikesh.dp.strategypattern;

import com.hrishikesh.dp.strategypattern.behaviors.impl.FlyRocketPowered;
import com.hrishikesh.dp.strategypattern.impl.MallardDuck;
import com.hrishikesh.dp.strategypattern.impl.ModelDuck;

/**
 * <p>
 *     Strategy Pattern
 *
 *     {@link "http://hrishikeshmishra.com/strategy-pattern/"}
 * </p>
 *
 * Created by hrishikesh.mishra
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model  = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
