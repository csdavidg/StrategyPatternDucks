/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.duck;

import co.com.duck.behavior.FlyNoWay;
import co.com.duck.behavior.FlyRocketPowered;
import co.com.duck.behavior.FlyWithWings;
import co.com.duck.behavior.MuteQuack;
import co.com.duck.behavior.Quack;

/**
 *
 * @author Usuario
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
